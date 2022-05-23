package order;

import BurgerEditorFrames.VegaBurgerMenuFrame;
import database.MySQLConnect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderFunctions
{
    private static Logger logger = LoggerFactory.getLogger(OrderFunctions.class);
    private static String[] burgerinfo=new String[5];
    private static String[] drinkinfo=new String[4];

    public static void upload() throws SQLException {

        addBurgerToDatabase();
        addDrinkToDatabase();
        int uploadedBurgerId = getUploadedBurgerId();
        //System.out.println("Megvan a feltöltendő id: " + uploadedBurgerId);
        int uploadedDrinkId =getUploadedDrinkId();
        //System.out.println(uploadedDrinkId);
        String finalsql = "INSERT INTO menu(userid, burgerid, drinkid) VALUES (" +MySQLConnect.connectedUSer.id+"," +uploadedBurgerId+"," +uploadedDrinkId+ ")";
        MySQLConnect.modifyDatabase(finalsql);
        logger.info("Data successfully uploaded to menu table");

        logger.info("Order done with user: " + MySQLConnect.connectedUSer.username);
        JOptionPane.showMessageDialog(null, "Order success with user: "+ MySQLConnect.connectedUSer.username+"\nPress ok to exit");
        logger.info("Ok button pressed, the program ends");
        System.exit(1);
    }

    private static void addBurgerToDatabase() throws SQLException {
        String burgersql = "INSERT INTO burger(mustard, mayonnaise, ketchup, meat, extraid) VALUES (" + SelectedBurgerInfo.b.hasMustard()+","+SelectedBurgerInfo.b.hasMayonnaise()+","+SelectedBurgerInfo.b.hasKetchup()+",\""+SelectedBurgerInfo.b.getMeat()+"\","+SelectedBurgerInfo.b.getExtraid()+")";
        burgerinfo[0]=SelectedBurgerInfo.b.hasMustard()+"";
        burgerinfo[1]=SelectedBurgerInfo.b.hasMayonnaise()+"";
        burgerinfo[2]=SelectedBurgerInfo.b.hasKetchup()+"";
        burgerinfo[3]=SelectedBurgerInfo.b.getMeat()+"";
        burgerinfo[4]=SelectedBurgerInfo.b.getExtraid()+"";
        //System.out.println(burgersql);
        MySQLConnect.modifyDatabase(burgersql);
        logger.info("Ordered burger uploaded successfully");
    }

    private static void addDrinkToDatabase() throws SQLException {
        int hot=0, co2=0, ice=0;
        if(SelectedDrinkInfo.d.isHot())
        {
            hot=1;
        }
        if(SelectedDrinkInfo.d.hasIce())
        {
            ice=1;
        }
        if(SelectedDrinkInfo.d.getco2())
        {
            co2=1;
        }
        String drinksql = "INSERT INTO drink(hot, co2, savour, ice) VALUES ("+hot+","+co2+",\""+SelectedDrinkInfo.d.getSavour()+"\","+ice+")";
        drinkinfo[0]=hot+"";
        drinkinfo[1]=co2+"";
        drinkinfo[2]=SelectedDrinkInfo.d.getSavour().toString();
        drinkinfo[3]=ice+"";


        //System.out.println(drinksql);
        MySQLConnect.modifyDatabase(drinksql);
        logger.info("Ordered drink uploaded successfully");
    }

    private static int getUploadedBurgerId() throws SQLException {
        String bsql = "select id from burger where mustard=" +burgerinfo[0]+
                " and " +
                "mayonnaise=" +burgerinfo[1]+
                " and " +
                "ketchup=" +burgerinfo[2]+
                " and " +
                "meat like \"" +burgerinfo[3]+
                "\"" +
                " and " +
                "extraid= " +burgerinfo[4]+
                " order by id desc limit 1";
        ResultSet res = MySQLConnect.executeQuery(bsql);
        res.next();
        logger.info("successfully got uploaded burger id");
        return res.getInt("id");
    }
    private static int getUploadedDrinkId() throws SQLException {
        String dsql = "SELECT id FROM drink where hot = "+drinkinfo[0] +
                " and co2 = "+drinkinfo[1] +
                " and savour like \""+drinkinfo[2] +
                "\" and" +
                " ice = "+drinkinfo[3]+" order by id desc limit 1";
        //System.out.println(dsql);

        ResultSet res = MySQLConnect.executeQuery(dsql);
        res.next();
        logger.info("successfully got uploaded drink id");
        return res.getInt("id");
    }
}

package order;

import BurgerEditorFrames.VegaBurgerMenuFrame;
import database.MySQLConnect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.sql.SQLException;

public class OrderFunctions
{
    public static void upload() throws SQLException {
        Logger logger = LoggerFactory.getLogger(OrderFunctions.class);
        String burgersql = "INSERT INTO burger(mustard, mayonnaise, ketchup, meat, extraid) VALUES (" + SelectedBurgerInfo.b.hasMustard()+","+SelectedBurgerInfo.b.hasMayonnaise()+","+SelectedBurgerInfo.b.hasKetchup()+",\""+SelectedBurgerInfo.b.getMeat()+"\","+SelectedBurgerInfo.b.getExtraid()+")";
        System.out.println(burgersql);
        MySQLConnect.modifyDatabase(burgersql);
        logger.info("Ordered burger uploaded successfully");




        logger.info("Order done with user: " + MySQLConnect.connectedUSer.username);
        JOptionPane.showMessageDialog(null, "Order success with user: "+ MySQLConnect.connectedUSer.username+"\nPress ok to exit");
        logger.info("Ok button pressed, the program ends");
        System.exit(1);



    }
}

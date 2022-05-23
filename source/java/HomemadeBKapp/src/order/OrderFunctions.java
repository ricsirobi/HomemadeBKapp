package order;

import database.MySQLConnect;

import java.sql.SQLException;

public class OrderFunctions
{
    public static void upload() throws SQLException {
        String burgersql = "INSERT INTO burger(mustard, mayonnaise, ketchup, meat, extraid) VALUES (" + SelectedBurgerInfo.b.hasMustard()+","+SelectedBurgerInfo.b.hasMayonnaise()+","+SelectedBurgerInfo.b.hasKetchup()+",\""+SelectedBurgerInfo.b.getMeat()+"\","+SelectedBurgerInfo.b.getExtraid()+")";
        System.out.println(burgersql);
        MySQLConnect.modifyDatabase(burgersql);

    }
}

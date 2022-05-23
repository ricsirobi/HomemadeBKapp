import burger.BaseBurger;
import burger.VegaBurger;
import dbclass.Burger;
import drink.Water;
import frames.LoginFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import database.MySQLConnect;
import java.sql.SQLException;


public class App {
    public static BaseBurger b;
    public static void setBurger()
    {
        b = new VegaBurger();
        System.out.println("vega");
    }
    public static void main(String[] args) throws SQLException {
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("project started");
        MySQLConnect.connectDatabase();
        LoginFrame loginFrame = new LoginFrame(true);
        logger.info("window initialized");

    }
}

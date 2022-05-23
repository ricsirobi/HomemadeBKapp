package test;

import Controller.LoginController;
import dbclass.Users;
import database.MySQLConnect;
import frames.LoginFrame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.sql.SQLException;

public class LoginControllerTest {


    LoginFrame testFrame;

    LoginController testController = new LoginController(testFrame);

    @Test
    public void getAuthenticatedUserTestWrongData() throws SQLException {
        MySQLConnect.connectDatabase();
        Users testUser = testController.getAuthenticatedUser("teszt", "teszt");
        Assertions.assertEquals("teszt", testUser.username);
    }

    @Test
    public void getAuthenticatedUserTestGoodData() throws SQLException {
        MySQLConnect.connectDatabase();
        Users testUser = testController.getAuthenticatedUser("aa", "aa");
        Assertions.assertEquals(null, testUser.username);
    }







}

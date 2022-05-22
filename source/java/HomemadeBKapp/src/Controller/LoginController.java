package Controller;

import database.MySQLConnect;
import dbclass.Users;
import frames.AddBurgerFrame;
import frames.LoginFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LoginController {

    private LoginFrame frame;

    public LoginController(LoginFrame f) {
        frame = f;
    }

    public boolean isUsernamePasswordEmpty(String usernameText, String passwordText) {
        if (!usernameText.isEmpty() && !passwordText.isEmpty()) {
            String username = frame.usernameField.getText();
            String password = frame.passwordField.getText();
            loginButtonClicked(username, password);
            return true;

        } else {
            JOptionPane.showMessageDialog(frame,
                    "Please type in a username and password", "Error!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void loginButtonClicked(String usr, String pswd) {
        frame.logger.info("Login button clicked.");

        user = getAuthenticatedUser(usr, pswd);
        if (user.username != null && user.password != null) {
            MySQLConnect.connectedUSer = user;
            frame.logger.info("User logged in.");
            frame.loginPanel.setVisible(false);
            frame.choicePanel.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Wrong username or password.", "Error!", JOptionPane.ERROR_MESSAGE);
        }

    }

    public Users user;

    public Users getAuthenticatedUser(String programUsername, String programPassword) {
        Users user = new Users();

        try {
            String sql = "SELECT * FROM users WHERE username='"
                    + programUsername + "' AND password=sha('" + programPassword + "');";
            ResultSet resultSet = MySQLConnect.executeQuery(sql);
            if (resultSet.next()) {
                user.username = resultSet.getString("username");
                user.password = resultSet.getString("password");
                user.id = resultSet.getInt("id");
            }
        } catch (Exception e) {
            e.printStackTrace();
            frame.logger.warn(e.getMessage());
        }
        return user;
    }

    private void registerUser(String programUsername, String programPassword) {
        try {
            String sql = "INSERT INTO users (username, password) VALUES('"
                    + programUsername + "', sha('" + programPassword + "'));";
            MySQLConnect.modifyDatabase(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int getTableSize() {
        frame.logger.info("Requesting table size from database.");
        int size = 0;
        try {
            String query = "SELECT COUNT(*) AS total FROM menu where userid ='"
                    + MySQLConnect.connectedUSer.id + "';";
            ResultSet res = MySQLConnect.executeQuery(query);
            res.next();
            size = res.getInt(1);

            frame.logger.info("Request successful.");
        } catch (Exception x) {

            x.printStackTrace();
        }
        return size;
    }

    private void prepareDataForTable(int size) {
      //ez majd kilistázza az ordereket
    }

    private void createMenuTable(String data[][], String columns[]) {
        frame.logger.info("Creating table.");
        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = new JTable(model);
        table.setShowGrid(true);
        table.setShowVerticalLines(true);
        JScrollPane pane = new JScrollPane(table);
        JFrame f = new JFrame("Populate JTable from Database");
        JPanel panel = new JPanel();
        panel.add(pane);
        f.add(panel);
        f.setSize(500, 250);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        frame.setVisible(false);
        LoginFrame temp = frame;
        f.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                f.dispose();
                temp.setVisible(true);
            }
        });
    }

    public void registrationButtonClicked() {
        frame.logger.info("Registration button clicked.");
        frame.loginPanel.setVisible(false);
        frame.registrationPanel.setVisible(true);
    }

    public void registrationRegistrationButtonClicked() {
        frame.logger.info("Registration button clicked on registration panel.");
        if (!frame.registrationUsernameField.getText().isEmpty() && !frame.registrationUsernameField.getText().isEmpty()) {
            String username = frame.registrationUsernameField.getText();
            String password = frame.registrationPasswordField.getText();
            registerUser(username, password);
            frame.logger.info("User created and stored in database successfully.");
            frame.registrationPanel.setVisible(false);
            frame.loginPanel.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Please type in a username and password", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void createNewMenuButtonClicked() {
        frame.logger.info("Create menu button pressed.");
        frame.dispose();
        AddBurgerFrame menu = new AddBurgerFrame();
    }

    public void checkOrdersButtonClicked() {
        frame.logger.info("Check orders button pressed");
        prepareDataForTable(getTableSize());
        frame.logger.info("Table successfully created.");
    }
}

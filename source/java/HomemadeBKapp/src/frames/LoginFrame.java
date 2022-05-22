package frames;

import Controller.LoginController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginFrame extends JDialog {
    public JTextField usernameField;
    public JTextField passwordField;
    private JButton loginButton;
    private JButton registrationButton;
    public JPanel loginPanel;
    public JPanel registrationPanel;
    public JTextField registrationUsernameField;
    public JTextField registrationPasswordField;
    private JButton registrationRegistrationButton;
    private JPanel overall;
    public JPanel choicePanel;
    private JButton createNewMenuButton;
    private JButton checkOrdersButton;
    public static Logger logger = LoggerFactory.getLogger(LoginFrame.class);
    private LoginController controller;

    public LoginFrame(boolean first) {
        setTitle("Login");
        setContentPane(overall);
        setSize(400, 300);
        UIDefaults uiDefaults = UIManager.getDefaults();
        uiDefaults.put("activeCaption", new javax.swing.plaf.ColorUIResource(Color.gray));
        uiDefaults.put("activeCaptionText", new javax.swing.plaf.ColorUIResource(Color.white));
        JFrame.setDefaultLookAndFeelDecorated(true);
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setModal(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        if (first) {
            registrationPanel.setVisible(false);
            choicePanel.setVisible(false);
        } else {
            loginPanel.setVisible(false);
            registrationPanel.setVisible(false);
        }

        controller = new LoginController(this);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.isUsernamePasswordEmpty(usernameField.getText(), passwordField.getText());
            }
        });

        registrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.registrationButtonClicked();
            }
        });

        registrationRegistrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.registrationRegistrationButtonClicked();
            }
        });

        createNewMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.createNewMenuButtonClicked();
            }
        });

        checkOrdersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.checkOrdersButtonClicked();
            }
        });

        setVisible(true);
    }
}

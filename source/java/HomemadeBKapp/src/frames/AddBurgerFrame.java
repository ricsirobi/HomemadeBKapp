package frames;

import burger.BaseBurger;
import burger.CheeseBurger;
import burger.ChickenBurger;
import burger.VegaBurger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBurgerFrame extends JFrame {
    private JButton CheeseburgerButton;
    private JButton ChickenburgerButton;
    private JButton VegaburgerButton;
    private JPanel ConfPanel;
    private JPanel BurgerTypePanel;

    public AddBurgerFrame() {
        Logger logger = LoggerFactory.getLogger(AddBurgerFrame.class);
        setContentPane(ConfPanel);
        setSize(800, 600);
        setTitle("Burger selector");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400, 300);
        UIDefaults uiDefaults = UIManager.getDefaults();
        uiDefaults.put("activeCaption", new javax.swing.plaf.ColorUIResource(Color.gray));
        uiDefaults.put("activeCaptionText", new javax.swing.plaf.ColorUIResource(Color.white));
        JFrame.setDefaultLookAndFeelDecorated(true);
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);


        CheeseburgerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logger.info("CheeseBurger button clicked");
                BurgerTypePanel.setVisible(false);
                BaseBurger burger = new CheeseBurger();
                /*try {
                    FighterConfigFrame fighterConfigFrame = new FighterConfigFrame((Fighter) fighter);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }*/
                dispose();
            }
        });
        ChickenburgerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logger.info("ChickenBurger button clicked");
                BurgerTypePanel.setVisible(false);
                BaseBurger burger = new ChickenBurger();

                /*try {
                    TransportConfigFrame transportConfigFrame = new TransportConfigFrame((Transport) transport);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }*/
                dispose();
            }
        });
        VegaburgerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logger.info("VegaBurger button clicked");
                BurgerTypePanel.setVisible(false);
                BaseBurger burger = new VegaBurger();

                /*try {
                    IndustrialConfigFrame industrialConfigFrame = new IndustrialConfigFrame((Industrial) industrial);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }*/
                dispose();
            }
        });
    }


}

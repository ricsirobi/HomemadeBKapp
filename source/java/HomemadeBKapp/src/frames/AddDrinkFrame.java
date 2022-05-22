package frames;

import DrinkEditorFrames.HotTeaMenuFrame;
import DrinkEditorFrames.IceTeaMenuFrame;
import DrinkEditorFrames.SoftDrinkMenuFrame;
import drink.HotTea;
import drink.IceTea;
import drink.SoftDrink;
import drink.Water;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDrinkFrame extends JFrame {
    private JPanel Panel;
    private JPanel DrinkTypePanel;
    private JButton hotTeaButton;
    private JButton SoftDrinkButton;
    private JButton iceTeaButton;

    public AddDrinkFrame() {
        Logger logger = LoggerFactory.getLogger(AddDrinkFrame.class);
        setContentPane(Panel);
        setSize(800, 600);
        setTitle("Drink selector");
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


        hotTeaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logger.info("hotTeaButton button clicked");
                DrinkTypePanel.setVisible(false);
                Water drink = new HotTea();
                //CheeseBurgerMenuFrame cheeseBurgerMenuFrame = new CheeseBurgerMenuFrame();
                HotTeaMenuFrame frame = new HotTeaMenuFrame();
                dispose();
            }
        });

        iceTeaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logger.info("iceTeaButton button clicked");
                DrinkTypePanel.setVisible(false);
                Water drink = new IceTea();
                //CheeseBurgerMenuFrame cheeseBurgerMenuFrame = new CheeseBurgerMenuFrame();
                IceTeaMenuFrame frame = new IceTeaMenuFrame();
                dispose();
            }
        });

        SoftDrinkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logger.info("SoftDrinkButton button clicked");
                DrinkTypePanel.setVisible(false);
                Water drink = new SoftDrink();
                SoftDrinkMenuFrame frame = new SoftDrinkMenuFrame();
                dispose();
            }
        });

    }


}

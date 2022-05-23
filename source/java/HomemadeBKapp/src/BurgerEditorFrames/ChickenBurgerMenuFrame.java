package BurgerEditorFrames;

import burger.BaseBurger;
import burger.CheeseBurger;
import burger.ChickenBurger;
import burger.Meat;
import dbclass.Extra;
import frames.AddDrinkFrame;
import order.SelectedBurgerInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChickenBurgerMenuFrame extends JFrame {
    private JPanel Panel;
    private JCheckBox mayonnaiseCheckBox;
    private JCheckBox mustardCheckBox;
    private JCheckBox ketchupCheckbox;
    private JButton NextButton;
    private JCheckBox saladCheckBox;
    private JLabel PriceLabel;

    public ChickenBurgerMenuFrame() {
        setContentPane(Panel);
        Logger logger = LoggerFactory.getLogger(ChickenBurgerMenuFrame.class);
        setSize(800, 600);
        setTitle("ChickenBurger editor");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400, 300);
        UIDefaults uiDefaults = UIManager.getDefaults();
        uiDefaults.put("activeCaption", new ColorUIResource(Color.gray));
        uiDefaults.put("activeCaptionText", new ColorUIResource(Color.white));
        JFrame.setDefaultLookAndFeelDecorated(true);
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);


        NextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ////////////////////////////////////////////////////
                BaseBurger b = new ChickenBurger();
                b.setKetchup(ketchupCheckbox.isSelected());
                b.setMayonnaise(mayonnaiseCheckBox.isSelected());
                b.setMustard(mustardCheckBox.isSelected());


                if(saladCheckBox.isSelected())
                {
                    b.setExtraid(2);
                }
                else
                {
                    b.setExtraid(3);
                }

                SelectedBurgerInfo.b = b;
                ////////////////////////////////////////////////////
                AddDrinkFrame drinkframe = new AddDrinkFrame();
                dispose();
            }
        });
    }

}


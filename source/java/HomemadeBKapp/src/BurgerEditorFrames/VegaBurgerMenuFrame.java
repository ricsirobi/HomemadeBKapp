package BurgerEditorFrames;

import frames.AddDrinkFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VegaBurgerMenuFrame extends JFrame {
    private JPanel Panel;
    private JCheckBox mayonnaiseCheckBox;
    private JCheckBox mustardCheckBox;
    private JCheckBox ketchupCheckbox;
    private JComboBox extraSelect;
    private JComboBox meatSelect;
    private JButton NextButton;
    private JLabel PriceLabel;


    public VegaBurgerMenuFrame() {
        setContentPane(Panel);
        Logger logger = LoggerFactory.getLogger(VegaBurgerMenuFrame.class);
        setSize(800, 600);
        setTitle("VegaBurger editor");
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
                AddDrinkFrame drinkframe = new AddDrinkFrame();
                dispose();
                //TODO: mentés
            }
        });
    }

}


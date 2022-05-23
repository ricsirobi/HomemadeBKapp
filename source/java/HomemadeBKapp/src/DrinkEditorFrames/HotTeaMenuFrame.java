package DrinkEditorFrames;

import burger.BaseBurger;
import burger.CheeseBurger;
import burger.Meat;
import dbclass.Extra;
import drink.HotTea;
import drink.Savour;
import drink.Water;
import frames.AddDrinkFrame;
import order.OrderFunctions;
import order.SelectedBurgerInfo;
import order.SelectedDrinkInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class HotTeaMenuFrame extends JFrame {
    private JPanel Panel;
    private JComboBox savourSelect;
    private JButton NextButton;
    private JLabel PriceLabel;

    public HotTeaMenuFrame() {
        setContentPane(Panel);
        Logger logger = LoggerFactory.getLogger(HotTeaMenuFrame.class);
        setSize(800, 600);
        setTitle("HotTea editor");
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
                Water w = new HotTea();

                switch (savourSelect.getSelectedIndex())
                {
                    case 0: w.setSavour(Savour.Green); break;
                    case 1: w.setSavour(Savour.Peach); break;
                    case 2: w.setSavour(Savour.Lemon); break;
                }
                SelectedDrinkInfo.d = w;
                ////////////////////////////////////////////////////
                try {
                    OrderFunctions.upload();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                dispose();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}


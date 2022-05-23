package DrinkEditorFrames;

import drink.HotTea;
import drink.Savour;
import drink.SoftDrink;
import drink.Water;
import order.OrderFunctions;
import order.SelectedDrinkInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class SoftDrinkMenuFrame extends JFrame {
    private JPanel Panel;
    private JComboBox savourSelect;
    private JButton NextButton;
    private JLabel PriceLabel;
    private JCheckBox iceCheckBox;

    public SoftDrinkMenuFrame() {
        setContentPane(Panel);
        Logger logger = LoggerFactory.getLogger(SoftDrinkMenuFrame.class);
        setSize(800, 600);
        setTitle("Soft-Drink editor");
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
                Water w = new SoftDrink();

                switch (savourSelect.getSelectedIndex())
                {
                    case 0: w.setSavour(Savour.Pepsi); break;
                    case 1: w.setSavour(Savour.SevenUp); break;
                    case 2: w.setSavour(Savour.Mirinda); break;
                    case 3: w.setSavour(Savour.CanadaDry); break;
                }


                if(iceCheckBox.isSelected())
                {
                    w.setIce(true);
                }
                else
                {
                    w.setIce(false);
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


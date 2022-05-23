package DrinkEditorFrames;

import order.OrderFunctions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class HotTeaMenuFrame extends JFrame {
    private JPanel Panel;
    private JComboBox savourSelect;
    private JButton NextButton;
    private JLabel PriceLabel;
    private JCheckBox ketchupCheckBox;
    private JComboBox ExtraSelect;
    private JComboBox meatSelector;
    private JCheckBox mustardCheckbox;
    private JCheckBox mayonnaiseCheckbox;

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
                //ReadyOrderForm readyframe = new ReadyOrderForm();
                //dispose();
                //TODO: mentés
                try {
                    OrderFunctions.upload();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}


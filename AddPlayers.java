package tournament;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Kyle
 */
public class AddPlayers extends JFrame {

    private String[] bracket;
    private JComboBox[] boxes;
    private String[] userNames;
    private JButton ok;
    Records r = new Records();
    BracketSorting bs = new BracketSorting();

    public AddPlayers(int size) {
        super("Add Players");
        setLayout(new FlowLayout());
        int counter = 1;

        bracket = new String[size];
        boxes = new JComboBox[size];
        userNames = new String[(Integer.parseInt(r.numUsers()) - 1)];

        for (int i = 0; i < (userNames.length); i++) {
            userNames[i] = r.lookUpName(counter);
            counter++;
        }

        for (int i = 0; i < (boxes.length); i++) {
            boxes[i] = new JComboBox(userNames);
            add(boxes[i]);
        }

        ok = new JButton("Ok");
        ok.setPreferredSize(new Dimension(40, 40));
        add(ok);

        Handler handler = new Handler();
        ok.addActionListener(handler);

    }

    private class Handler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            for (int i = 0; i < boxes.length; i++) {
                bracket[i] = (r.lookUpName(boxes[i].getSelectedIndex() + 1));
            }
            bs.setFields(bracket);
            
            BracketGUI gui = new BracketGUI(bracket);
            gui.setVisible(true);
            
        }
    }
}

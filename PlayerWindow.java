package tournament;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Kyle
 */
public class PlayerWindow extends JFrame{
    
    private JLabel displayName;
    private JLabel wins;
    private JLabel displayWins;
    private JLabel loses;
    private JLabel displayLoses;
    
    Records r = new Records();
    
    public PlayerWindow(String username){
        super("insert username" + " stats");
        setLayout(new FlowLayout());
        
        displayName = new JLabel(username);
        add(displayName);
        
        wins = new JLabel("WINS: ");
        add(wins);
        
        displayWins = new JLabel(r.lookUpValue(username, "wins"));
        add(displayWins);
        
        loses = new JLabel("LOSES: ");
        add(loses);
        
        displayLoses = new JLabel(r.lookUpValue(username, "loses"));
        add(displayLoses);
        
        
    }
    
}

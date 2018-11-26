package tournament;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Kyle
 */
public class PlayerStats extends JFrame{
    
    private JButton player1;
    private JButton player2;
    private JButton player3;
    private JButton player4;
    private JButton player5;
    private JButton player6;
    private JButton player7;
    private JButton player8;
    private JButton player9;
    
    Records r = new Records();
    int playerNumber = 1;
    
    
    public PlayerStats(){
        super("Players");
        setLayout(new FlowLayout());
        
        
        player1 = new JButton(r.lookUpName(playerNumber));
        player1.setPreferredSize(new Dimension(100, 100));
        add(player1);
        playerNumber++;
        
        player2 = new JButton(r.lookUpName(playerNumber));
        player2.setPreferredSize(new Dimension(100, 100));
        add(player2);
        playerNumber++;
        
        player3 = new JButton(r.lookUpName(playerNumber));
        player3.setPreferredSize(new Dimension(100, 100));
        add(player3);
        playerNumber++;
        
        player4 = new JButton(r.lookUpName(playerNumber));
        player4.setPreferredSize(new Dimension(100, 100));
        add(player4);
        playerNumber++;
        
        player5 = new JButton(r.lookUpName(playerNumber));
        player5.setPreferredSize(new Dimension(100, 100));
        add(player5);
        playerNumber++;
        
        player6 = new JButton(r.lookUpName(playerNumber));
        player6.setPreferredSize(new Dimension(100, 100));
        add(player6);
        playerNumber++;
        
        player7 = new JButton(r.lookUpName(playerNumber));
        player7.setPreferredSize(new Dimension(100, 100));
        add(player7);
        playerNumber++;
        
        player8 = new JButton(r.lookUpName(playerNumber));
        player8.setPreferredSize(new Dimension(100, 100));
        add(player8);
        playerNumber++;
        
        player9 = new JButton(r.lookUpName(playerNumber));
        player9.setPreferredSize(new Dimension(100, 100));
        add(player9);
        playerNumber++;
        
        Handler handler = new Handler();
        player1.addActionListener(handler);
        player2.addActionListener(handler);
        player3.addActionListener(handler);
        player4.addActionListener(handler);
        player5.addActionListener(handler);
        player6.addActionListener(handler);
        player7.addActionListener(handler);
        player8.addActionListener(handler);
        player9.addActionListener(handler);
    }
    
    private class Handler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            PlayerWindow pw = new PlayerWindow();
            
        }
    }
}

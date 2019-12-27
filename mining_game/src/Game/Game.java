/*
 * By:     Matthew Fischer
 * Date:   
 */
package Game;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/**
 *
 * @author Matthew Fischer
 */
public class Game extends JFrame{
    
    // CONTAINER
    Container content = this.getContentPane();
    
    // PANEL
    JPanel p = new JPanel();
    
    // create Jlabel for game status
    JLabel status = new JLabel("Welcome to Mining", JLabel.CENTER);
    
    // BOARD ARRAY
    JButton[][] board = new JButton[100][100];
    
    // MAP ARRAY
    Mining m = new Mining();
    
    public Game(){
        this.createWindow();
        
        
        // add status window
        content.add(status,BorderLayout.NORTH);
        
        // status label details
        status.setOpaque(true);// make status visible
        status.setFont(new Font("Helvetica", Font.BOLD, 32));// set font
        status.setBackground(Color.red);// set background color yellow
        
        // panel details
        p.setLayout(new GridLayout(100,100,3,3));// grid layout
        p.setBackground(Color.black);// set background color black
        
        // add panel to content
        content.add(p, BorderLayout.CENTER);
        
        for(int row = 0; row < 100; row++){
            for(int col = 0; col < 100; col++){
                board[row][col] = new JButton("X");
                board[row][col].setOpaque(true);// set text visible
                board[row][col].setBackground(Color.white);//set background color
                
                // set label font
                board[row][col].setFont(new Font("Helvetica", Font.BOLD, 32));
                
                p.add(board[row][col]);
                
            }
        }
        
    }
    
    public static void main(String[] args) {
        Game g = new Game();
        
        
        
        
    }
    
    // CREATE WINDOW JFRAME
    public void createWindow()
    {
        // create program window
        this.setVisible(true);// set window visible
        this.setSize(1000,1000);// set window size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set window will close on exiting button
        this.setTitle("Mining");// set window title
    }
}

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
    
    // ROBOT
    Robot r2 = new Robot();
    
    public Game(){
        this.createWindow();
        
        
        // ADD STATUS
        content.add(status,BorderLayout.NORTH);
        
        // STATUS 
        status.setOpaque(true);// make status visible
        status.setFont(new Font("Helvetica", Font.BOLD, 32));// set font
        status.setBackground(Color.BLUE);// set background color yellow
        
        // PANEL DETAILS
        p.setLayout(new GridLayout(20,20,1,1));// grid layout
        p.setBackground(Color.black);// set background color black
        
        // ADD PANEL
        content.add(p, BorderLayout.CENTER);
        
        // ADD JLABEL TO PANEL
        for(int row = 0; row < 20; row++){
            for(int col = 0; col < 20; col++){
                board[row][col] = new JButton("col"+col);
                board[row][col].setOpaque(true);// set text visible
                board[row][col].setBackground(Color.white);//set background color
                if(m.map[row][col].rock == true){
                    board[row][col].setBackground(Color.white);//set background color
                }
                else if(m.elevator[row] == row && m.elevator[col] == col){
                    board[row][col].setBackground(Color.blue);//set background color
                }else{
                    // ELEVATOR
                    board[row][col].setBackground(Color.red);//set background color
                }
                // set label font
                board[row][col].setFont(new Font("Helvetica", Font.BOLD, 12));
                
                p.add(board[row][col]);
                
            }
        }
        
    }
    
    public static void main(String[] args) {
        Game g = new Game();
        
        g.mine_closest();
        g.mine_closest();
        g.mine_closest();
        g.mine_closest();
        
    }
    
    // CREATE WINDOW JFRAME
    public void createWindow()
    {
        // create program window
        this.setVisible(true);// set window visible
        this.setSize(1800,1000);// set window size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set window will close on exiting button
        this.setTitle("Mining");// set window title
    }
    
    // FIND CLOSEST
    public void mine_closest(){
        
        Cell close = m.closest_cell;
        
        // SET CLOSEST CELL
        m.setClosest_cell();
        
        // MINE CELL
        //m.map[close.x][close.y].setRock(false);
        close.setRock(false);
        System.out.println("second test bool " + close.getRock());
        // PAINT CELL
        board[close.x][close.y].setBackground(Color.red);
        
        
        // ROBOT UPDATE TIME WORKED
        this.robot_time_worked();
    }
    
    // ROBOT TIME WORKED
    public void robot_time_worked(){
        int time_worked = (m.closest_cell.x + m.closest_cell.y) * r2.getSpeed();
        
        r2.setTime_worked(time_worked);
    }
}

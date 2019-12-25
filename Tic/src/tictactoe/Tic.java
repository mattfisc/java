 /** CSIS-113B-3923
 * Name: Matthew Fischer
 * ID: 0549714
 * Date: 05/06/2018
 * Description: GUI program for TicTacToe.  Created the program with two 2D
 * arrays.  The program is extended from JFrame and implemented with 
 * ActionListener and MouseListener.  
 **/

package tictactoe;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


// extend JFrame and implement events: action listener and mouse listener
public class Tic extends JFrame implements ActionListener, MouseListener 
{
    // get Pane
    Container content = this.getContentPane();
    
    // create button
    JButton play = new JButton("Restart");
    
    // create panels
    JPanel p = new JPanel();
    JPanel score = new JPanel();
    
    // create Jlabel for game status
    JLabel status = new JLabel("Welcome to TicTacToe", JLabel.CENTER);
    
    // create 2D arrays
    JLabel[][] grid = new JLabel[3][3];// 2d object array
    char[][] game = new char[3][3];// 2d char array
    
 
 
    boolean endGame = false;// X always goes first

    // create font for status
    Font fntStatus = new Font("Helvetica",Font.BOLD,12);// status label font
    
    // score values
    int win = 0;
    int lose = 0;
    int tie = 0;
    
    // score JLabels
    JLabel wins = new JLabel("Wins " + win, JLabel.CENTER);
    JLabel loses = new JLabel("Loses " + lose, JLabel.CENTER);
    JLabel ties = new JLabel("Ties " + tie, JLabel.CENTER);
   
    
    public Tic()
    {
        // create gui window
        this.createWindow();
        
        // add status window
        content.add(status,BorderLayout.NORTH);
        
        // status label details
        status.setOpaque(true);// make status visible
        status.setFont(fntStatus);// set font
        status.setBackground(Color.yellow);// set background color yellow
        
        // panel details
        p.setLayout(new GridLayout(3,3,3,3));// grid layout
        p.setBackground(Color.black);// set background color black
        
        // add panel to content
        content.add(p, BorderLayout.CENTER);
        
        // add restart button
        content.add(play, BorderLayout.SOUTH);
        play.addActionListener(this);
        
        
        // score panes
        // panel details
        score.setLayout(new GridLayout(3,1));// grid layout
        
        // add panel to content
        content.add(score, BorderLayout.EAST);
        
        // add score on the right
        score.add(wins);
        score.add(loses);
        score.add(ties);
        
        
        
        
//creating grid through nested for-loop 
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                // initialize char game 2d array
                game[row][col] = ' ';// set game array to char ' '
                
                // create JLabel object in each grid index
                grid[row][col] = new JLabel(" ", JLabel.CENTER);
                grid[row][col].setSize(100,100);
                
                // label attached to mouse click
                grid[row][col].addMouseListener(this);
                grid[row][col].setOpaque(true);// set text visible
                grid[row][col].setBackground(Color.white);//set background color
                
                // set label font
                grid[row][col].setFont(new Font("Helvetica", Font.BOLD, 32));
                
               
                p.add(grid[row][col]);// add grid label to panel
                
                
            }
        }
        
    }
    
    public void createWindow()
    {
        // create program window
        this.setVisible(true);// set window visible
        this.setSize(400,400);// set window size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set window will close on exiting button
        this.setTitle("TicTacToe");// set window title
    }
    
    // Reset game
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        resetGame();// reset game
        status.setText("'X's turn");// x's turn output
    }
    
    // Player turn
    @Override
    public void mouseClicked(MouseEvent e) 
    {
  
        JLabel clicked = (JLabel) e.getSource();
        
        next:
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                if(clicked == grid[row][col])
                {
                    // clicking on previous label
                    if(!" ".equals(clicked.getText())) {
                        status.setText("Invalid Move");// invalid move
                        break next;// break
                    } 
                    
                    else if(" ".equals(clicked.getText()) )
                    {
                        // PLAYER TURN
                        if(endGame == false){
                            
                            clicked.setText("X");// set X
                            clicked.setForeground(Color.RED); // set X color red
                            game[row][col] = 'X';// set 'X' game char array

                            // END OF PLAYER TURN
                            gameOver();
                        }
                        
                        // COMPUTER TURN
                        if(endGame == false){
                            
                            // TO FAST TO DISPLAY
                            status.setText("Computer's Turn");

                            computerTurnRnd();

                            // END OF COMPUTER TURN
                            gameOver();
                        }
                        
                        
                    }
                    
                    
                    else
                    {
                        
                        System.out.println("error in clicks");
                    }
                    
                   
                }
            }
        }
        
            
    }
    
    // COMPUTER TURN
    public void computerTurnRnd(){
        Random rnd = new Random();
        int row = rnd.nextInt(3);
        int col = rnd.nextInt(3);
        
        // PICK AVAILABLE MOVE
        while(game[row][col] != ' '){
            row = rnd.nextInt(3);
            col = rnd.nextInt(3);
        }
        System.out.println("computer turn " + row +" " +col);
        // display computer turn
        game[row][col] = 'O';
        grid[row][col].setText("0");
        grid[row][col].setForeground(Color.BLACK);
       
    }
    
   
    public void gameOver()
    {
        
        char winner = ' ';// store winning player 'X' or 'O'
        
        
        //   X OR O   IS WINNER
        // CHECK FIRST DIAGONAL
        if(game[0][0] == game[1][1] && game[0][0] == game[2][2] && game[0][0] != ' ')
        {
            winner = game[0][0];// set winner
        }
        
        // CHECK SECOND DIAGONAL
        else if(game[2][0] == game[1][1] && game[2][0] == game[0][2] && game[2][0] != ' ')
        {
            winner = game[2][0];// set winner
        }
        
        // CHECK ROWS AND COLUMNS
        else
        {
            for(int row = 0; row < 3; row++)
            {
                for(int col = 0; col < 3; col++)
                {
                    // CHECK ROW
                    if(game[row][0] != ' ' && game[row][0] == game[row][1] 
                            && game[row][0] == game[row][2] )
                    {
                        winner = game[row][0];// set winner
                    }
                    
                    // CHECK COL
                    // ROW CHECKS EACH ROW
                    else if(game[0][row] != ' ' && game[0][row] == game[1][row] && game[0][row] == game[2][row])
                    {
                        winner = game[0][row];// set winner
                    }
                }
            }
        }
        
        // TIE GAME OR GAME CONTINUES
        boolean noMovesLeft = true;
        if(winner == ' '){
            // NO WINNER  AND END OF SPACES
            
            for(int i = 0; i < 3;i++){
                for(int j = 0; j < 3;j++){
                    if(game[i][j] == ' '){
                        noMovesLeft = false;
                    }
                }
            }
        }
        
        // DECLARE TIE GAME
        if(noMovesLeft && winner == ' ')
        {
           
            status.setText("Tie Game");// status label outputs
            tie++;
            ties.setText("Ties " + tie);
            endGame = true;
        }
        
        // DECLARE WINNER
        else if(winner != ' ')
        {
            // label outputs winner
            status.setText("Game Over " + winner + " Won!!!");
            endGame = true;
            
            if(winner == 'X'){
                win++;
                wins.setText("Wins " + win);
            }
            if(winner == 'O'){
                lose++;
                loses.setText("Loses " + lose);
            }
        }
        else{
            // GAME CONTINUES NO WINNER FOUND
            status.setText("X's Turn");// label outputs turn

        }
        
        
        
    }
    
    // reset game 
    public void resetGame()
    {
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                endGame = false;
                grid[row][col].setText(" ");// set all grid labels to " "
                game[row][col] = ' ';// set all game char to ' '
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) 
    {

    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {

    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {

    }

    @Override
    public void mouseExited(MouseEvent e) 
    {

    }
    
   
    
    public static void main(String[] args) 
    {
        Tic t = new Tic();// create instance of class
    }
    
}

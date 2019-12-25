/*
 * By:     Matthew Fischer
 * Date:   
 */
package mining;

/**
 *
 * @author Matthew Fischer
 */
public class Robot {
    private int[] closest_block;
    
    private int positionX;
    private int positionY;
    
  
    private int speed;
    
    private int time_worked;
    
    public Robot(){
        closest_block = new int[2];// store closest
        
        speed = 1; // 1 square per seconds
        time_worked = 100; // total time worked 100 seconds
    }
    
    public void estimate_closest(){
        int southD = 0;
        int eastD = 0;
        
        closest_block[0] = southD;
        closest_block[1] = eastD;
 
    }
    
}

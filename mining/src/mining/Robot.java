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
    
}

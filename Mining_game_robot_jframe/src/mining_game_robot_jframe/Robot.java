/*
 * By:     Matthew Fischer
 * Date:   
 */
package mining_game_robot_jframe;

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

    public int[] getClosest_block() {
        return closest_block;
    }

    public void setClosest_block(int[] closest_block) {
        this.closest_block = closest_block;
    }

    public int getTime_worked() {
        return time_worked;
    }

    public void setTime_worked(int time_worked) {
        this.time_worked = time_worked;
    }
    
}

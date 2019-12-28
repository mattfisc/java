/*
 * By:     Matthew Fischer
 * Date:   
 */
package Game;

/**
 *
 * @author Matthew Fischer
 */
public class Robot {
    
    private int positionX;
    private int positionY;
    
  
    private int speed;
    private int time_worked;
    
    public Robot(){
  
        
        speed = 1; // 1 square per seconds
        time_worked = 100; // total time worked 100 seconds
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTime_worked() {
        return time_worked;
    }

    public void setTime_worked(int time_worked) {
        this.time_worked += time_worked;
    }

    
}

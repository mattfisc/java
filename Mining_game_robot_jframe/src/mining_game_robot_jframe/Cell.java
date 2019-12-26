/*
 * By:     Matthew Fischer
 * Date:   
 */
package mining_game_robot_jframe;

/**
 *
 * @author Matthew Fischer
 */
public class Cell extends Mining{
    
    // AUTO NOT MINED
    public boolean rock;
    
    public Cell(){ // ERROR
        this.rock = true;
    }
    
    public boolean getRock(){
       return rock;
    }
    
    public void setRock(boolean mined){
        rock = mined;
    }

}

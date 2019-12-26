/*
 * By:     Matthew Fischer
 * Date:   
 */
package mining_game_robot_jframe;

/**
 *
 * @author Matthew Fischer
 */
public class Cell{
    
    // AUTO NOT MINED
    private boolean rock;
    
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

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
    public boolean rock;
    
    public Cell(){ // ERROR
        this.rock = true;
    }
    
    private boolean getRock(){
       return rock;
    }
    
    private void setRock(boolean mined){
        rock = mined;
    }

}

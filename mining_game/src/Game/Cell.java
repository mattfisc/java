/*
 * By:     Matthew Fischer
 * Date:   
 */
package Game;

/**
 *
 * @author Matthew Fischer
 */
public class Cell extends Mining{
    
    // AUTO NOT MINED
    public boolean rock;
    
    public Cell(){
        rock = true;
    }
    
    public boolean getRock(){
       return rock;
    }
    
    public void setRock(boolean mined){
        rock = mined;
    }

}

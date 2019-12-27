/*
 * By:     Matthew Fischer
 * Date:   
 */
package Game;

/**
 *
 * @author Matthew Fischer
 */
public class Cell{
    
    // AUTO NOT MINED
    public boolean rock;
    public int x;
    public int y;
    
    public Cell(int x, int y){
        rock = true;
        this.x = x;
        this.y = y;
    }
    
    public boolean getRock(){
       return rock;
    }
    
    public void setRock(boolean mined){
        rock = mined;
    }

}

/*
 * By:     Matthew Fischer
 * Date:   
 */
package mining;

/**
 *
 * @author Matthew Fischer
 */
public class Cell extends Mining{
    
    // AUTO NOT MINED
    private boolean rock;
    
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

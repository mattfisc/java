/*
 * By:     Matthew Fischer
 * Date:   
 */
package mining;

/**
 *
 * @author Matthew Fischer
 */
public class Cell {
    
    // AUTO NOT MINED
    private boolean rock = true;
    
    public Cell(){
        
    }
    
    private void mined(){
       rock = false;
    }

}

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
    private boolean rock;
    private int x;
    private int y;
    
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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}

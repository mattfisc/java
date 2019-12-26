/*
 * By:     Matthew Fischer
 * Date:   
 */
package mining;

/**
 *
 * @author Matthew Fischer
 */
public class Game {
    Mining map;
    Robot r2;
    
    public Game(){
        map = new Mining();
        r2 = new Robot();
    }
    public static void main(String[] args) {
        Game g = new Game();
        System.out.println();
    }
    
    // MINING 
    public void mine_rock(int x,int y){
        // CHANGE ROCK
        map.setCellMined(x, y);
        
        // CHANGE ROBOT WORK
        
    }
}

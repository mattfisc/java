/*
 * By:     Matthew Fischer
 * Date:   
 */
package Game;

/**
 *
 * @author Matthew Fischer
 */
public class Game {
    Mining m;
    Robot r2;
    
    public Game(){
        m = new Mining();
        r2 = new Robot();
    }
    public static void main(String[] args) {
        Game g = new Game();
        
        System.out.println( m.map[0][0].rock);
    }
    
    // MINING 
    public void mine_rock(int x,int y){
        // CHANGE ROCK
        m.setCellMined(x, y);
        
        // SET CLOSEST CELL
        m.setClosest_cell();
        
        // GET CLOSEST CELL
        m.getClosest_cell();
        // CHANGE ROBOT WORK
        r2.setTime_worked(m.getClosest_distance());
    }
}

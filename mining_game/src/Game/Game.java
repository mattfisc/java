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
    Mining map;
    Robot r2;
    
    public Game(){
        map = new Mining();
        r2 = new Robot();
    }
    public static void main(String[] args) {
        Game g = new Game();
        //boolean x = map.getCell(0, 0);
    }
    
    // MINING 
    public void mine_rock(int x,int y){
        // CHANGE ROCK
        map.setCellMined(x, y);
        
        // SET CLOSEST CELL
        map.setClosest_cell();
        
        // GET CLOSEST CELL
        map.getClosest_cell();
        // CHANGE ROBOT WORK
        r2.setTime_worked(map.getClosest_distance());
    }
}

/*
 * By:     Matthew Fischer
 * Date:   
 */
package mining_game_robot_jframe;

/**
 *
 * @author Matthew Fischer
 */
public class Program {

    Mining map = new Mining();
    Robot r2 = new Robot();
    
    
    public static void main(String[] args) {
        

    Mining m = new Mining();
    Cell c = new Cell();
    System.out.println("mine" + m.getCell(0, 0));
    //Program p = new Program();
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

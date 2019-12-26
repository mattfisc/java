
package mining;

/**
 *
 * @author Matthew Fischer
 */
public class Mining {

    private Cell[][] map;
    private int[] elevator = {0,0};
    

    public Mining(){
        map  = new Cell[100][100];
        
        // SET ELEVATOR TO MINED
        map[0][0].setRock(false);
  
    }
    
    public void estimate_closest(){
        
        int closest_cell[] = new int[2];
        
        // START CORDINATES 0,0
        // START HERE 
        // WORST CASE SENARIO
        double closestD = 200;
        
        for(int s = 0; s < map.length; s++){
            for(int e = 0; e < map[0].length; e++){
                
                // FIND CLOSEST
                // DISTANCE FORMULA         
                // SECOND POINT IS(0,0)
                double distance = Math.sqrt( Math.pow(s,2)+ Math.pow(e,2) );
                
                if(distance < closestD){
                    // NEW CLOSEST DISTANCE
                    closestD = distance;
                    // CLOSEST CELL
                    closest_cell[0] = s;
                    closest_cell[1] = e;
                }
            }
        }
    }
    
}

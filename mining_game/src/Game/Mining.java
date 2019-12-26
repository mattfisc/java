
package Game;

/**
 *
 * @author Matthew Fischer
 */
public class Mining {

    public Cell[][] map;
    public int[] elevator = {0,0};
    public int closest_cell[];
    public int closest_distance;

    public Mining(){
        map  = new Cell[100][100];
        
        // INITAILIZE MAP
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                map[i][j] = new Cell();
            }
        }
        
        // SET ELEVATOR TO MINED
        map[0][0].setRock(false);
        
        
        // X, Y
        closest_cell = new int[2];
    }
    
    
    
    // GET CELL
    public boolean getCell(int x,int y){
        return map[x][y].getRock();
    }
    
    // SET CELL
    public void setCellMined(int x, int y){
        map[x][y].setRock(false);
    }

    public int[] getClosest_cell() {
        return closest_cell;
    }

    public void setClosest_cell() {
        // START CORDINATES 0,0
        // START HERE 
        // WORST CASE SENARIO
        closest_distance = 200;
        
        for(int s = 0; s < map.length; s++){
            for(int e = 0; e < map[0].length; e++){
                
                // FIND CLOSEST
                // DISTANCE FORMULA         
                // SECOND POINT IS(0,0)
                int distance = (int)(Math.sqrt( Math.pow(s,2)+ Math.pow(e,2) ));
                
                if(distance < closest_distance){
                    // NEW CLOSEST DISTANCE
                    closest_distance = distance;
                    // CLOSEST CELL
                    closest_cell[0] = s;
                    closest_cell[1] = e;
                }
            }
        }
    }

    public int getClosest_distance() {
        return closest_distance;
    }

    


    
}

/*
 * By:     Matthew Fischer
 * Date:   
 */
package mining;

/**
 *
 * @author Matthew Fischer
 */
public class Mining {

    private Cell[][] map;
    private int[] position;
    
    public Mining(){
        map  = new Cell[100][100];
        position = [0][0];
    }
    
    public void estimate_closest(){
        int closest_cell[] = new int[2];
        
        // CLOSEST POINT
        int[] is_closest = new int[2];
        
        for(int s = 0; s < map.length; s++){
            for(int e = 0; e < map[0].length; e++){
                if(map[s][e].getRock() == false){
                    
                }
            }
        }
        
    }
    
}

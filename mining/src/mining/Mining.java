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
    private int[] elevator = {0,0};
    
    public Mining(){
        map  = new Cell[100][100];
  
    }
    
    public void estimate_closest(){
        int closest_cell[] = new int[2];
        
        // CLOSEST POINT
        // START HERE
        int[] is_closest = null;
        
        for(int s = 0; s < map.length; s++){
            for(int e = 0; e < map[0].length; e++){
                // NULL
                if(is_closest == null){
                    is_closest = 
                }
                
                if(map[s][e].getRock() == true){
                    
                    // IF CLOSEST < CHECK
                    if( (is_closest[0]-s)+(is_closest[1]-e) < (s - elevator[0])+(e-elevator[1]) ){
                        
                    }
                }
            }
        }
        
    }
    
}

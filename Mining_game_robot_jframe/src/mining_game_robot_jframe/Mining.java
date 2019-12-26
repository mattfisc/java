
package mining_game_robot_jframe;

/**
 *
 * @author Matthew Fischer
 */


public class Mining {

    public Cell[][] map;

  

    public Mining(){
        map  = new Cell[100][100];
        
        
        for(int s = 0; s < 100; s++){
            for(int e = 0; e < 100; e++){
                map[s][e] = new Cell();
            }
        }
    }
}

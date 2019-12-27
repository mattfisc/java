
package Game;

/**
 *
 * @author Matthew Fischer
 */
public class Mining {

    public Cell[][] map;
    public int[] elevator = {0,0};
    public Cell closest_cell;
    public int closest_distance;

    public Mining(){
        map  = new Cell[100][100];
        
        // INITAILIZE MAP
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                map[i][j] = new Cell(i,j);
            }
        }
        
        // ELEVATOR SET TO ROCK MINED
        map[elevator[0]][elevator[1]].setRock(false);
        
        
    }

    public Cell[][] getMap() {
        return map;
    }

    public void setMap(Cell[][] map) {
        this.map = map;
    }

    public int[] getElevator() {
        return elevator;
    }

    public void setElevator(int[] elevator) {
        this.elevator = elevator;
    }

    public Cell getClosest_cell() {
        return closest_cell;
    }

    public void setClosest_cell() {
        // START CORDINATES 0,0
        // START HERE 
        // WORST CASE SENARIO
        closest_distance = 0;
        
        int x = 1;
        int y = 1;
        // FIND CELL CLOSEST AT DIAGONAL
        
        while(map[x][y].rock == false){
            x++;
            y++;
        }
        
        // ROCK FOUND WORST CASE
        for(int i = 0; i <= x; i++){
            for(int j = 0; j <= y; j++){
                
            }
        }
    }

    public int getClosest_distance() {
        return closest_distance;
    }

    public void setClosest_distance(int closest_distance) {
        this.closest_distance = closest_distance;
    }
    
    
    


    
}

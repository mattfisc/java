
package Game;

/**
 *
 * @author Matthew Fischer
 */
public class Mining {

    public Cell[][] map;
    public int[] elevator = new int[2];
    public Cell closest_cell;
    public double closest_distance;

    public Mining(){
        map  = new Cell[20][20];
        
        elevator[0] = Math.round(map.length/2);
        elevator[1] = Math.round(map[0].length/2);
        
        // FIRST CLOSEST CELL
        //closest_cell = new Cell(1,1);
        
        // INITAILIZE MAP
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
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
        
        // WORST CASE DIAGONAL DISTANCE FROM ELEVATOR
        closest_distance = Math.sqrt( Math.pow(20-elevator[1], 2) + Math.pow(20-elevator[0],2) );
        
        // FIND CLOSER CELL
        for(int y = 0; y <= map.length; y++){// row or y
            for(int x = 0; x <= map[0].length; x++){// col or x
                
                // CLOSEST DISTANCE FROM ELEVATOR
                double temp = Math.sqrt( Math.pow(y-elevator[1], 2) + Math.pow(x-elevator[0],2) );
                
                if(closest_distance > temp && map[x][y].getRock() == true){
                    
                    closest_distance = temp;
                    closest_cell = map[x][y];
                    
                    // TEST
                    //System.out.println("closest cell (" + closest_cell.getX() + ", " + closest_cell.getY() + ") " + closest_cell.getRock());
                   
                }
            }
        }
    }

    public double getClosest_distance() {
        return closest_distance;
    }

    public void setClosest_distance(int closest_distance) {
        this.closest_distance = closest_distance;
    }
    
    
    


    
}

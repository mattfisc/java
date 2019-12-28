
package Game;

/**
 *
 * @author Matthew Fischer
 */
public class Mining {

    public Cell[][] map;
    public int[] elevator = {0,0};
    public Cell closest_cell;
    public double closest_distance;

    public Mining(){
        map  = new Cell[20][20];
        
        // FIRST CLOSEST CELL
        closest_cell = new Cell(1,1);
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

        int col = 0;
        int row = 0;
        
        // FIND CELL CLOSEST AT DIAGONAL
        while(map[col][row].rock == false){
            col++;
            row++;
        }
        // REINITIALIZE NEW WORST CASE CLOSEST CELL
        closest_cell = map[col][row];
        
        closest_distance = Math.sqrt( Math.pow(col, 2) + Math.pow(row,2) );
        
        System.out.println("closest d " + closest_distance);
        
        double temp = 0;
        // FIND CLOSER CELL
        for(int y = 0; y <= closest_distance; y++){// row or y
            for(int x = 0; x <= closest_distance; x++){// col or x
                temp = Math.sqrt( Math.pow(y, 2) + Math.pow(x,2) );
                if(closest_distance > temp && map[y][x].getRock() == true){
                    closest_distance = temp;
                    closest_cell = new Cell(x,y);
                    
                    System.out.println("closest cell (" + closest_cell.x + ", " + closest_cell.y + ") " + closest_cell.rock);
                   
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

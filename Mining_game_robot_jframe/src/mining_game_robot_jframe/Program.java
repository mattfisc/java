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

    public static void main(String[] args) {
        

        Mining m = new Mining();
        Cell c = new Cell();

        for(int i = 0; i < 100; i++){
            System.out.println(m.map[0][i].getRock());
        }
    }
    
}

package tournament;

import java.util.Random;

/**
 *
 * @author Kyle
 */
public class Main {

    public static void main(String[] args) {
        
        Gui gui = new Gui();
        gui.setVisible(true);
    }
    //int[] array = new int[5];
    //arrayMixer(array);
    public static void arrayMixer(int[] array) {
        Random rand = new Random();
        int[] arrayCopy;

        for (int i = 0; i <= (array.length - 1); i++) {
            array[i] = i;
        }

        arrayCopy = array;

        for (int i = 0; i <= 8; i++) {
            int x, y;
            x = rand.nextInt(5);
            y = rand.nextInt(5);

            arrayCopy[x] = array[y];
            arrayCopy[y] = array[x];
            array = arrayCopy;
        }
    }
    
    
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Elliott on 01/11/2015.
 */
public class Sort {

    private static Random random = new Random();

    /**
     *
     * @param list List of items to shuffle
     * @param max Number of items to sort
     * @param <T> Type of object to be shuffled (must extend <code>Comparable</code>
     */
    public static <T extends Comparable<T>> void shuffle(ArrayList<T> list, int max) {
        for (int i = 0; i < max; i++) {
            int j = random.nextInt(max);
            swap(list, i, j);
        }
    }

    /**
     * Method used to swap two values inside an array, given their index inside the array
     * @param list List where the values are to be swapped
     * @param i First index of the item to be swapped
     * @param j Second index of the item to be swapped
     * @param <T> Type of object to be swapped (must extend <code>Comparable</code>
     */
    public static <T> void swap(List<T> list, int i, int j) {
        T first = list.get(i);
        list.set(i, list.get(j));
        list.set(j, first);
    }

}

/**
 * Created by Elliott on 13/11/2015.
 */
public class Main {

    public static void main(String[] args) {
        SwapSort swapSort = new SwapSort(3, 5, 2, 7, 8, 9);
        swapSort.sort();

        swapSort.forEach(string -> System.out.print(string + ","));
        System.out.println();

        SwapSort swapSort2 = new SwapSort(12512, 35, -3526, 7, 3626, -9);
        swapSort2.sort();

        swapSort2.forEach(string -> System.out.print(string + ","));
    }
}

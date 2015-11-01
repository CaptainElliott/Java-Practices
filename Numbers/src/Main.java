import java.util.Random;

/**
 * Created by Elliott on 01/11/2015.
 */
public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {
        OddEven oddEven = new OddEven(random.nextInt(100));
        System.out.println(oddEven.getNumber() + " is " + oddEven.toString() + "\n");

        Prime prime = new Prime(random.nextInt(100));
        System.out.println(prime.getNumber() + " is " + prime.toString() + "\n");
    }

}

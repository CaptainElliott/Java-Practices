/**
 * Created by Elliott2 on 03-May-16.
 */
public class Storage {

    private static Store storage = new Store();

    public static void main(String[] args) {
        store(442,352,35,353,1,1,"w");
    }

    public static void store(Object... values) {
        for (Object i : values)
            if (validate(i))
                storage.add((int) i);
    }

    private static boolean validate(Object value) {
        if (value instanceof Integer) {
            if ((Integer) value >= 0 && (Integer) value <= 100) {
                if (storage.getIntStorage().contains(value)) {
                    System.out.println("The storage already contains this integer: " + value + "!");
                    return true;
                }
                System.out.println("All safe to add " + value + " to storage");
                return true;

            } else {
                System.out.println(value + " is the not between 0 and 100!");
                return false;
            }
        } else {
            System.err.println(value + " is not an integer, cannot store!");
            return false;
        }
    }
}

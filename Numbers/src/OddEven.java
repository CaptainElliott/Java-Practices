/**
 * Created by Elliott on 01/11/2015.
 */
public class OddEven extends Number {

    public OddEven(int num) {
        super(num);
    }

    public boolean isOdd() {
        return super.getNumber() % 2 != 0;
    }

    public boolean isEven() {
        return super.getNumber() % 2 == 0;
    }

    public String toString() {
        return isEven() ? "Even" : "Odd";
    }
}

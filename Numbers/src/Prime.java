
/**
 * Created by Elliott on 01/11/2015.
 */
public class Prime extends Number {

    public Prime(int num) {
        super(num);
    }

    public  boolean isPrime() {

        if (super.getNumber() <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(super.getNumber()); i++) {
            if (super.getNumber() % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return isPrime() ? "Prime" : "Not Prime";
    }

}

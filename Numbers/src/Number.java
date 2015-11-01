/**
 * Created by Elliott on 01/11/2015.
 */
public abstract class Number {

    private int num;

    public Number(int num) {
        this.num = num;
    }

    public int getNumber() {
        return this.num;
    }

    public abstract String toString();

}

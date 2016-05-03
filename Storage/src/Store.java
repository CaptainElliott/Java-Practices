import java.util.LinkedList;
import java.util.List;

/**
 * Created by Elliott2 on 03-May-16.
 */
public class Store {

    private List<Integer> intStorage = new LinkedList<>();

    public void add(int i) {
        this.intStorage.add(i);
    }

    public int find(int i) {
        return this.intStorage.get(this.intStorage.indexOf(i));
    }

    public void remove(int i) {
        this.intStorage.remove(this.intStorage.indexOf(i));
    }

    public int getAtindex(int index) {
        return this.intStorage.get(index);
    }

    public void removeAtIndex(int index) {
        this.intStorage.remove(index);
    }

    public void clear() {
        this.intStorage.clear();
    }

    public List<Integer> getIntStorage() {
        return this.intStorage;
    }

}

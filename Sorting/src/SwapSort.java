import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Elliott on 13/11/2015.
 */
public class SwapSort extends Sort implements Iterable<Integer> {

    private List<Integer> sort;

    public SwapSort(Integer... integers) {
        this.sort = new ArrayList<>();
        Collections.addAll(this.sort, integers);
    }

    public void sort() {
        for (int i = this.sort.size(); i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (this.sort.get(j).compareTo(this.sort.get(j+1)) > 0) {
                    swap(this.sort, j, j+1);
                }
            }
        }
    }

    public List<Integer> getList() {
        return this.sort;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this.sort.iterator();
    }
}

package modal.interfaces;

import java.util.List;

public interface SearchSort<T> {
    void search(List<T> list,String name);
    void sort();
}

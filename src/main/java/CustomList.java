import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.LinkedList;
import java.util.List;

public class CustomList {
    private List<String> list;

    public CustomList() {
        list = new LinkedList<String>();
    }

    public boolean isEmpty() {
        if (list.size() == 0) {
            return true;
        } else return false;
    }

    public int size() {
        return list.size();
    }

    public void add(String val) {
        list.add(val);
    }

    public String get(int index) {
        if (list.size() == 0 || index > size() - 1) {
            return null;
        }
        return list.get(index);
    }
}

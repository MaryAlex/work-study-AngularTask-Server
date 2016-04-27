package hello;

import java.util.ArrayList;
import java.util.List;

public class Obj {
    public List<Item> items = new ArrayList<>();
    public Boolean more;

    public List<Item> getItems() {
        return items;
    }

    public Boolean getMore() {
        return more;
    }
}

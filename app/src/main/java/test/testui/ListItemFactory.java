package test.testui;

import java.util.ArrayList;

/**
 * Created by hisashi on 2016-11-10.
 */

public class ListItemFactory {
    private static ArrayList<ListItem> items = new ArrayList<>();
    private static ListItemFactory instance = new ListItemFactory();

    private ListItemFactory() {
        ListItem item1 = new ListItem("Item 1", 4);
        ListItem item2 = new ListItem("Item 2", 4);
        ListItem item3 = new ListItem("Item 3", 4);
        ListItem item4 = new ListItem("Item 4", 4);
        ListItem item5 = new ListItem("Item 5", 4);

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
    }

    public static ArrayList<ListItem> getItemList() {
        return items;
    }
}

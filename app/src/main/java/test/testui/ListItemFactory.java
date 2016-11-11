package test.testui;

import java.util.ArrayList;

/**
 * Created by hisashi on 2016-11-10.
 */

public class ListItemFactory {
    private static ArrayList<AbstractListItem> items = new ArrayList<>();
    private static ListItemFactory instance = new ListItemFactory();

    private ListItemFactory() {
        AbstractListItem item1 = new ListOne("Item 1", 4);
        AbstractListItem item2 = new ListTwo("Item 2", 4);
        AbstractListItem item3 = new ListOne("Item 3", 4);
        AbstractListItem item4 = new ListOne("Item 4", 4);
        AbstractListItem item5 = new ListOne("Item 5", 4);

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
    }

    public static ArrayList<AbstractListItem> getItemList() {
        return items;
    }
}

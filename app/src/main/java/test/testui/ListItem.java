package test.testui;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hisashi on 2016-11-10.
 */

public class ListItem {
    private String itemName;
    private int itemLength;
    private ArrayList<String> indicatorTitles;
    private ArrayList<Integer> images;

    public ListItem(String name, int length) {
        this.itemName = name;
        this.itemLength = length;
        this.indicatorTitles = Lists.newArrayList("1", "2", "3", "4");
        this.images = Lists.newArrayList(R.drawable.bg1, R.drawable.bg2, R.drawable.bg3, R.drawable.bg4);
    }

    public String getItemName() {
        return this.itemName;
    }

    public int getItemLength() {
        return this.itemLength;
    }

    public List<String> getIndicatorTitles(){
        return this.indicatorTitles;
    }

    public List<Integer> getItemImages(){
        return this.images;
    }
}

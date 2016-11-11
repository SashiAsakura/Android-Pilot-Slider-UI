package test.testui;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hisashi on 2016-11-10.
 */

public abstract class AbstractListItem {
    private String itemName;
    private int itemLength;
    private ArrayList<String> indicatorTitles;
    private ArrayList<Integer> images;

    protected AbstractListItem(String name, int length) {
        this.itemName = name;
        this.itemLength = length;
    }

    protected String getName() {
        return this.itemName;
    }

    protected int getLength() {
        return this.itemLength;
    }

    protected List<String> getIndicatorTitles(){
        return this.indicatorTitles;
    }

    protected List<Integer> getImages(){
        return this.images;
    }

    protected void setIndicatorTitles(ArrayList<String> titles) {
        this.indicatorTitles = titles;
    }

    protected void setImages(ArrayList<Integer> images) {
        this.images = images;
    }
}

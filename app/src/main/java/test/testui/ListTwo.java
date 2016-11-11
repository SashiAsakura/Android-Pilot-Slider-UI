package test.testui;

import com.google.common.collect.Lists;

/**
 * Created by hisashi on 2016-11-10.
 */

public class ListTwo extends AbstractListItem {
    public ListTwo(String name, int length) {
        super(name, length);

        this.setIndicatorTitles(Lists.newArrayList("1", "2", "3", "4", "5"));
        this.setImages(Lists.newArrayList(R.drawable.bg1, R.drawable.bg2, R.drawable.bg3, R.drawable.bg4, R.drawable.bg1));
    }
}

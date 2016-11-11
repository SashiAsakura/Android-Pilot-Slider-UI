package test.testui;

import com.google.common.collect.Lists;

/**
 * Created by hisashi on 2016-11-10.
 */

public class ListOne extends AbstractListItem {
    public ListOne(String name, int length) {
        super(name, length);

        this.setIndicatorTitles(Lists.newArrayList("1", "2", "3", "4"));
        this.setImages(Lists.newArrayList(R.drawable.bg1, R.drawable.bg2, R.drawable.bg3, R.drawable.bg4));
    }
}

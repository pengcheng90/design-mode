package pers.xbb.structural.adapter;

import org.junit.Test;
import pers.xbb.structural.adapter.clazz.ClazzAdapter;
import pers.xbb.structural.adapter.clazz.ClazzTarget;

public class ClazzAdapterTest {

    @Test
    public void test() {
        ClazzTarget target = new ClazzAdapter();
        target.sort();
    }
}

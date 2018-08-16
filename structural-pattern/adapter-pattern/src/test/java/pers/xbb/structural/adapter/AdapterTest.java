package pers.xbb.structural.adapter;

import org.junit.Test;
import pers.xbb.structural.adapter.object.Target;
import pers.xbb.structural.adapter.object.TargetAdapter;

public class AdapterTest {

    @Test
    public void testAdapter() {
        Target target = new TargetAdapter();
        /**
         * 实际调用的为Sort和Search中的方法
         */
        target.sort();
        target.search();
    }
}

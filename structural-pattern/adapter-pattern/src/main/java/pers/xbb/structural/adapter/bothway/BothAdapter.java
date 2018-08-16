package pers.xbb.structural.adapter.bothway;

/**
 * 3.双向是适配器：实现目标接口中的方法，同时继承适配者的接口
 * 使用很少。
 */
public class BothAdapter extends BothAdaptee implements BothTarget {
    public void sort() {
        System.out.println("双向适配器：实现目标类中方法");
    }
}

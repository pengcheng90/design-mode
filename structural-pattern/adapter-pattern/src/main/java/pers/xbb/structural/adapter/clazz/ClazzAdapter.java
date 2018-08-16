package pers.xbb.structural.adapter.clazz;

/**
 * 2.类适配器模式：与对象适配器模式不同的是，适配器和适配者之间是继承关系。
 * <p>
 * 由于Java、C#等语言不支持多重类继承，因此类适配器的使用受到很多限制，例如如果目标抽象类Target不是接口，而是一个类，就无法使用类适配器；
 */
public class ClazzAdapter extends ClazzSort implements ClazzTarget {
    public void sort() {
        clazzSort();
    }
}

package pers.xbb.structural.adapter.object;

/**
 * 1：对象适配器：适配器和适配者之间是关联关系
 * <p>
 * 适配Sort和Search的接口
 * 用于解决接口不兼容的问题
 */
public class TargetAdapter implements Target {

    private Sort sort = new Sort();
    private Search search = new Search();

    public void sort() {
        sort.desSort();
    }

    public void search() {
        search.binarySearch();
    }
}

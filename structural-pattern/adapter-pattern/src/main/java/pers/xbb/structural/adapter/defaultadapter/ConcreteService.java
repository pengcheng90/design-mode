package pers.xbb.structural.adapter.defaultadapter;

/**
 * 具体业务类：继承缺省适配器类
 */
public class ConcreteService extends AbstractService {
    @Override
    public void sort() {
        System.out.println("默认实现其中方法");
    }
}

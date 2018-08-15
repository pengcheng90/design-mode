package pers.xbb.builder.pattern;

public class ConcreteBuilder extends Builder {
    public void productA() {
        System.out.println("构建产品名称");
        product.setName("AAA产品");
    }

    public void productB() {
        System.out.println("构建描述");
        product.setDesc("质量保证！");
    }
}

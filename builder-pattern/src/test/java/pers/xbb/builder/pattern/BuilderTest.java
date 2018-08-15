package pers.xbb.builder.pattern;

import org.junit.Test;

public class BuilderTest {
    @Test
    public void builder() {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.constructor();
        System.out.println("产品：" + product.toString());
    }
}

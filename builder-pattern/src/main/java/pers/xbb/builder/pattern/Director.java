package pers.xbb.builder.pattern;

/**
 * 指挥者：用于指挥构造者如何构造
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * 构造过程
     *
     * @return
     */
    public Product constructor() {
        builder.productA();
        builder.productB();
        return builder.getResult();
    }
}

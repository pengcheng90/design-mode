package pers.xbb.builder.pattern;

/**
 * 构造者抽象类
 */
abstract class Builder {

    protected Product product = new Product();

    public abstract void productA();

    public abstract void productB();

    public Product getResult() {
        return this.product;
    }

}

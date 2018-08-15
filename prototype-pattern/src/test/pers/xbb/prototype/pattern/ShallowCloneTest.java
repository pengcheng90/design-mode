package pers.xbb.prototype.pattern;


import org.junit.Test;

public class ShallowCloneTest {

    @Test
    public void ShallowClone(){
        pers.xbb.prototype.pattern.ShallowClone shallowClone=new pers.xbb.prototype.pattern.ShallowClone();
        shallowClone.setName("jack");
        shallowClone.setSex("man");
        System.out.println("原型对象:"+shallowClone.toString());

        ShallowClone clone = null;
        try {
            clone = (ShallowClone) shallowClone.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("克隆对象:"+clone.toString());
    }
}

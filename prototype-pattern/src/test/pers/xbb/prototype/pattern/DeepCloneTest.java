package pers.xbb.prototype.pattern;


import org.junit.Test;

public class DeepCloneTest {

    @Test
    public void DeepCloneTest() {
        DeepClone deepClone = new DeepClone();
        deepClone.setName("tom");
        Department department = new Department("开发部");
        deepClone.setDepartment(department);
        System.out.println("原型对象:" + deepClone.toString());


        DeepClone clone = null;
        try {
            clone = (DeepClone) deepClone.deepClone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("克隆对象:" + clone.toString());

        /**
         * 结果：对象不相等：克隆了新的对象,引用类型成员变量也不相等
         * 深克隆，需要克隆的对象必须实现Serializable接口
         *
         */
        System.out.println("克隆对象是否和原型对象相等：" + (deepClone == clone));
        System.out.println("引用类型成员变量是否相等：" + (deepClone.getDepartment() == clone.getDepartment()));

    }
}

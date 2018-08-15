package pers.xbb.prototype.pattern;


import org.junit.Test;

public class ShallowCloneTest {

    @Test
    public void ShallowClone() {
        pers.xbb.prototype.pattern.ShallowClone shallowClone = new pers.xbb.prototype.pattern.ShallowClone();
        shallowClone.setName("jack");
        shallowClone.setAge(18);
        Role role = new Role();
        role.setRoleId(1);
        role.setRoleName("管理员");
        System.out.println("原型对象:" + shallowClone.toString());


        ShallowClone clone = null;
        try {
            clone = (ShallowClone) shallowClone.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("克隆对象:" + clone.toString());

        /**
         * 结果：对象不相等：克隆了新的对象
         * 但是引用类型成员变量相等。
         * 所以是浅克隆
         */
        System.out.println("克隆对象是否和原型对象相等：" + (shallowClone == clone));
        System.out.println("引用类型成员变量是否相等：" + (shallowClone.getRole() == clone.getRole()));

    }
}

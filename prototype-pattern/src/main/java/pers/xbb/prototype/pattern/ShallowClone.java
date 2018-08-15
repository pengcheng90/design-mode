package pers.xbb.prototype.pattern;

/**
 * 浅克隆:实现Cloneable接口
 */
public class ShallowClone implements Cloneable {

    private String name;
    private Integer age;
    /**
     * 浅克隆：引用类型成员变量只会复制地址
     */
    private Role role;

    /**
     * 重写Object的clone()方法实现浅克隆
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "ShallowClone{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", role=" + role +
                '}';
    }
}

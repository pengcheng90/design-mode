package pers.xbb.prototype.pattern;

import java.io.*;

/**
 * 深克隆：使用序列化写入流的方式，然后再从流中获取
 */
public class DeepClone implements Serializable {

    private String name;
    private Department department;

    protected DeepClone deepClone() throws CloneNotSupportedException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bos);
            objectOutputStream.writeObject(this);

            DeepClone deepClone = null;
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(bis);
            return (DeepClone) objectInputStream.readObject();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "DeepClone{" +
                "name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}

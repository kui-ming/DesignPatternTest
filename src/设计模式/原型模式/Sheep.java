package 设计模式.原型模式;

import 设计模式.原型模式.原型管理器.Animal;

import java.io.*;

public class Sheep implements Animal,Serializable {
    public String name;
    public String color;
    private int age;


    public Sheep(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        // 模拟对构造方法进行数据准备操作，不做的话JVM会对new方法进行优化，那样new的效率肯定高于clone
        if (name != null){
            name += "羊";
            name = name.substring(name.length()-1);
        }
    }

    /**
     * 浅拷贝
     * @return 通过浅拷贝复制的新对象
     */
    @Override
    public Sheep clone(){
        try {
            return (Sheep) super.clone();
        }catch (CloneNotSupportedException e){
            // 没有实现Cloneable接口还调用clone()方法会抛CloneNotSupportedException异常
            System.out.println("克隆失败, 可能是未实现Cloneable接口！");
        }
        return null;
    }

    /**
     * 深拷贝
     * @return 通过深拷贝复制的对象
     */
    public Sheep deepClone(){
        // 写入流的对象必须实现Serializable序列化接口，其引用型属性也要实现，这里的引用型属性只有String类型，已经自动实现过序列化接口
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        Sheep sheep = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            sheep =  (Sheep) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
          try {
              bos.close();
              bis.close();
              oos.close();
              ois.close();
          } catch (IOException e) {
          }
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

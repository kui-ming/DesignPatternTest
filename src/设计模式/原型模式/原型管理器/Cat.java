package 设计模式.原型模式.原型管理器;

public class Cat implements Animal {
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        // 模拟对构造方法进行数据准备操作，不做的话JVM会对new方法进行优化，那样new的效率肯定高于clone
        if (name != null){
            name += "猫";
            name = name.substring(name.length()-1);
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Cat clone() {
        try {
            return (Cat) super.clone();
        } catch (CloneNotSupportedException e){
        }
        return null;
    }
}

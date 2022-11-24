package 设计模式.原型模式.原型管理器;

public class Dog implements Animal {
    private String name;
    private String color;
    private int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        // 模拟对构造方法进行数据准备操作，不做的话JVM会对new方法进行优化，那样new的效率肯定高于clone
        if (name != null){
            name += "狗";
            name = name.substring(name.length()-1);
        }
    }

    @Override
    public Dog clone() {
        try {
            return (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
        }
        return null;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

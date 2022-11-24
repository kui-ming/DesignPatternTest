package 设计模式.原型模式.原型管理器;

import 设计模式.原型模式.Sheep;

public class Test {
    public static void main(String[] args) {
        PrototypeManager prototypeManager = new PrototypeManager();
        Cat cat = null;
        Dog dog = null;
        Sheep sheep = null;
        long time = System.currentTimeMillis();
        // 模拟在循环体中大量创建对象
        for (int i = 0; i < 1000000; i++) {
            cat = new Cat("Tom", "black", 7);
            dog = new Dog("Dog", "white", 5);
            sheep = new Sheep("Dolly", "white", 5);
        }
        System.out.println("通过构造方法new：");
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(sheep);
        System.out.println("新建对象运行时间：" + (System.currentTimeMillis() - time) + "ms");

        time = System.currentTimeMillis();
        // 模拟在循环体中大量创建对象
        for (int i = 0; i < 1000000; i++) {
            cat = (Cat) prototypeManager.get("cat");
            dog = (Dog) prototypeManager.get("dog");
            sheep = (Sheep) prototypeManager.get("sheep");
        }
        System.out.println("原型管理器创建：");
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(sheep);
        System.out.println("原型模式创建对象运行时间：" + (System.currentTimeMillis() - time) + "ms");
    }
}

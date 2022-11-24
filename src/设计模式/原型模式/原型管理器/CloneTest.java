package 设计模式.原型模式.原型管理器;

import 设计模式.原型模式.Sheep;

public class CloneTest {
    public static void main(String[] args) {
        // 使用new String()可以创建一个新的引用对象，以此来区分浅拷贝下的引用变量是否被重新创建，但使用字面量都会指字符串常量池中的地址
        Sheep sheep = new Sheep(new String("Dolly"), "white", 5);
        Sheep sheep2 = new Sheep(new String("Dolly"), "white", 5);
        // 使用浅拷贝创建一个对象
        Sheep sheep3 = sheep.clone();
        // 使用深拷贝创建一个对象
        Sheep sheep4 = sheep.deepClone();
        System.out.println("普通新建对象：");
        System.out.println("    sheep和sheep2是否指向同一个地址：" + (sheep == sheep2));
        System.out.println("    sheep的引用属性和sheep2的引用属性是否指向同一个地址：" + (sheep.name == sheep2.name));
        System.out.println("    因为使用了字面量，肯定都指向常量池中的地址：" + (sheep.color == sheep2.color));
        System.out.println("浅拷贝：");
        System.out.println("    sheep和sheep3是否指向同一个地址：" + (sheep == sheep3));
        System.out.println("    sheep的引用属性和sheep3的引用属性是否指向同一个地址：" + (sheep.name == sheep3.name));
        System.out.println("    因为使用了字面量，肯定都指向常量池中的地址：" + (sheep.color == sheep3.color));
        System.out.println("深拷贝：");
        System.out.println("    sheep和sheep4是否指向同一个地址：" + (sheep == sheep4));
        System.out.println("    sheep的引用属性和sheep4的引用属性是否指向同一个地址：" + (sheep.name == sheep4.name));
        System.out.println("    因为使用了字面量，肯定都指向常量池中的地址：" + (sheep.color == sheep4.color));

    }
}

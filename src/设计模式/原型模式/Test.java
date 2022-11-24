package 设计模式.原型模式;

public class Test {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        // 模拟在循环体中大量创建对象
        for (int i = 0; i < 1000000 ; i++){
            Sheep sheep = new Sheep("Dolly","white", 5);
        }
        System.out.println("新建对象运行时间：" + (System.currentTimeMillis() - time) + "ms");

        // 准备一个原型对象
        Sheep prototypeObj =  new Sheep("Dolly","white", 5);
        time = System.currentTimeMillis();
        // 模拟在循环体中大量创建对象
        for (int i = 0; i < 1000000 ; i++){
            Sheep sheep = prototypeObj.clone();
        }
        System.out.println("原型模式创建对象运行时间：" + (System.currentTimeMillis() - time) + "ms");
    }
}

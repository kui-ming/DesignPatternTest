package 设计模式.单例模式;

public class 静态内部类测试 {

    static {
        System.out.println("外部静态模板被执行~");
    }

    静态内部类测试(){
        System.out.println("外部内对象被创建~");
    }

    static class 内部类{
        static {
            System.out.println("内部静态模快被执行~");
        }
        static int a = 2;

        内部类(){
            System.out.println("内部类对象被创建~");
        }
    }

    public static void main(String[] args) {
        静态内部类测试 a = new 静态内部类测试();
        内部类 b = new 内部类();
        System.out.println(内部类.a);
        b = new 内部类();
    }

}

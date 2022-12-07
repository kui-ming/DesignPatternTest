package 设计模式.结构型模式.代理模式;

import 设计模式.结构型模式.代理模式.静态代理.房东类;
import 设计模式.结构型模式.代理模式.静态代理.房屋中介代理类;
import 设计模式.结构型模式.代理模式.静态代理.租房接口类;

public class 客户程序 {

    public static void main(String[] args) {
        // 使用代理模式
        租房接口类 找房 = new 房屋中介代理类();
        找房.租();
        // 不使用代理
        System.out.println("————————————");
        租房接口类 房东 = new 房东类();
        房东.租();
    }
}

package 设计模式.结构型模式.代理模式.静态代理;

/**
 * **代理角色（Proxy）**：持有对真实主题角色的引用，负责调用真实主题角色中相应的接口方法
 */
public class 房屋中介代理类 implements 租房接口类 {

    租房接口类 房东; // 持有对真实对象的引用

    public 房屋中介代理类() {
        房东 = new 房东类(); // 创建真实对象
    }

    @Override
    public void 租() {
        System.out.println("中介找房！");
        房东.租();
    }
}

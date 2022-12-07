package 设计模式.结构型模式.代理模式.静态代理;

/**
 * **真实主题角色（Real Subject）**：负责执行具体的任务，客户程序可以通过代理角色间接的调用真实主题角色的方法
 */
public class 房东类 implements 租房接口类 {
    @Override
    public void 租() {
        System.out.println("实现租房");
    }
}

package 设计模式.结构型模式.装饰器模式;

/**
 * 具体构件角色，因为本案例只有一个具体构件，所以不需要设置抽象构件来约束构件角色
 */
public class 机甲类 {

    public void 展示(){
        System.out.println("机甲开始组装……组装完毕！");
    }
}

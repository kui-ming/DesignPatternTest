package 设计模式.结构型模式.装饰器模式;

public class 多功能组合臂模块 extends 外设类 {

    public 多功能组合臂模块(机甲类 待装机甲) {
        super(待装机甲);
    }

    @Override
    public void 展示() {
        // 执行装饰类附加的功能
        System.out.println("装备【多功能组合臂模块】");
        // 最后执行被装饰类的功能
        待装机甲.展示();
    }
}

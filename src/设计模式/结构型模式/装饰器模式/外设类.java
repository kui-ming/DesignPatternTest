package 设计模式.结构型模式.装饰器模式;

/**
 * 抽象装饰角色，约束具体装饰类的方法
 */
public abstract class 外设类 extends 机甲类 {

    protected 机甲类 待装机甲;

    public 外设类(机甲类 待装机甲){
        // 持有被装饰类，通过聚合关系达到被装饰类与装饰类的组合
        this.待装机甲 = 待装机甲;
    }

    // 规定具体装饰类通过该方法来对被装饰类的功能进行扩展
    public abstract void 展示();
}

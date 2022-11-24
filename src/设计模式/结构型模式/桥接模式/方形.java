package 设计模式.结构型模式.桥接模式;

public class 方形 extends 图形 {
    // 通过构造方法传递具体的实现类对象，由抽象类保存维护
    protected 方形(图形颜色 颜色) {
        super(颜色);
    }

    @Override
    public void 绘制() {
        // 在此方法中调用实现类，进行多维组合
        System.out.println("绘制一个正方形，并且开始上色："+颜色.上色());
    }
}

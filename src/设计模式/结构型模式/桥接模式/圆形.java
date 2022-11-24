package 设计模式.结构型模式.桥接模式;

public class 圆形 extends 图形 {

    // 通过构造方法传递具体的实现类对象，由抽象类保存维护
    protected 圆形(图形颜色 颜色) {
        super(颜色);
    }

    @Override
    public void 绘制() {
        // 在此方法中调用实现类，进行多维组合
        System.out.println("绘制一个圆形，并开始上色："+颜色.上色());
    }
}

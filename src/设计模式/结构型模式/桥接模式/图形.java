package 设计模式.结构型模式.桥接模式;

/**
 * 抽象化角色
 */
public abstract class 图形 {
    // 维护一个实现化的对象
    protected 图形颜色 颜色;

    protected 图形(图形颜色 颜色){
        // 通过构造方法注入实现类过程就是桥接的过程
        this.颜色 = 颜色;
    }

    public abstract void 绘制();
}

package 设计模式.结构型模式.组合模式;

/**
 * 简单组件
 */
public class 文本域组件 extends 抽象组件 {

    public 文本域组件(String name) {
        super(name);
    }

    @Override
    public void 绘制() {
        // 重写父类抽象方法
        System.out.println("名为“" + name + "”的【文本域组件】绘制完成");
    }

    public void 添加(抽象组件 组件) {
        System.out.println("基础组件不支持添加！");
    }

    public void 删除(抽象组件 组件) {
        System.out.println("基础组件不支持删除！");
    }
}

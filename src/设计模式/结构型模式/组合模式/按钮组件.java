package 设计模式.结构型模式.组合模式;

/**
 * 简单组件
 */
public class 按钮组件 extends 抽象组件 {

    public 按钮组件(String name) {
        super(name);
    }

    @Override
    public void 绘制() {
        // 重写父类抽象方法
        System.out.println("名为“" + name + "”的【按钮组件】绘制完成");
    }

    public void 添加(抽象组件 组件) {
        // 因为简单组件无法添加或移除其他组件，所以简单组件的添加和删除方法没有任何意义
        System.out.println("基础组件不支持添加！");
    }

    public void 删除(抽象组件 组件) {
        // 因为简单组件无法添加或移除其他组件，所以简单组件的添加和删除方法没有任何意义
        System.out.println("基础组件不支持删除！");
    }
}

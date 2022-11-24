package 设计模式.组件模式;

/**
 * 组件的抽象类，抽象构件角色
 */
public abstract class 抽象组件 {
    public String name; // 组件名称

    public 抽象组件(String name) {
        this.name = name;
    }

    public abstract void 绘制();
    //public abstract void 添加(抽象组件 组件);
    //public abstract void 删除(抽象组件 组件);
}

package 设计模式.组件模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合组件，由多个简单组件组成
 */
public class 登录框聚合组件 extends 抽象组件 {

    public List<抽象组件> 子组件列表 = new ArrayList<>();

    public 登录框聚合组件(String name) {
        super(name);
    }

    @Override
    public void 绘制() {
        // 编写复制的绘制方法，无需让客户程序（测试类）再编写
        System.out.println("名为" + name + "的【登录框组件】开始绘制：");
        for (抽象组件 子组件 : 子组件列表) {
            System.out.print("\t├---"); // 做一点显示的加工
            子组件.绘制();
        }
        System.out.println(name + "绘制完成！");

    }

    public void 添加(抽象组件 组件) {
        // 添加子组件
        子组件列表.add(组件);
    }

    public void 删除(抽象组件 组件) {
        // 删除不需要的子组件
        子组件列表.remove(组件);
    }
}

package 设计模式.抽象工厂模式.工厂;

import 设计模式.抽象工厂模式.实体.*;

public abstract class 抽象工厂 {
    public abstract 鞋 获取一双鞋(String 鞋子类别名);
    public abstract 衣服 获取一件衣服(String 衣服类别名);
}

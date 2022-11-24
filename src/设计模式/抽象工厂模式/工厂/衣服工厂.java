package 设计模式.抽象工厂模式.工厂;

import 设计模式.抽象工厂模式.实体.*;

public class 衣服工厂 extends 抽象工厂 {
    @Override
    public 鞋 获取一双鞋(String 鞋子类别名) {
        return null;
    }

    @Override
    public 衣服 获取一件衣服(String 衣服类别名) {
        衣服 一件衣服 = null;
        // 通过使用者传来的字符串来判断工厂创建什么衣服
        switch (衣服类别名){
            case "卫衣":
                一件衣服 = new 卫衣();
                break;
            case "衬衫":
                一件衣服 = new 衬衫();
                break;
            case "毛衣":
                一件衣服 = new 毛衣();
                break;
        }
        // 默认设置下衣服大小与颜色
        if (一件衣服 != null){
            一件衣服.设置衣服大小(42);
            一件衣服.染色("黑色");
        }
        // 工厂返回创建好的衣服
        return 一件衣服;
    }
}

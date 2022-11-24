package 设计模式.工厂模式;

import 设计模式.工厂模式.实体.拖鞋;
import 设计模式.工厂模式.实体.皮鞋;
import 设计模式.工厂模式.实体.跑鞋;
import 设计模式.工厂模式.实体.鞋;

public class 工厂类 {

    public static 鞋 获取一双鞋(String 鞋子类别名){
        鞋 一双鞋子 = null;
        // 通过使用者传来的字符串来判断工厂创建什么鞋子
        switch (鞋子类别名){
            case "皮鞋":
                一双鞋子 = new 皮鞋();
                break;
            case "拖鞋":
                一双鞋子 = new 拖鞋();
                break;
            case "跑鞋":
                一双鞋子 = new 跑鞋();
                break;
        }
        // 反正用户没指定什么鞋码和颜色，默认设置下鞋码与颜色
        if (一双鞋子 != null){
            一双鞋子.设置鞋码(42);
            一双鞋子.染色("黑色");
        }
        // 工厂返回创建好的鞋子
        return 一双鞋子;
    }
}

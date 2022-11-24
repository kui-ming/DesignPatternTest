package 设计模式.抽象工厂模式;

import 设计模式.抽象工厂模式.实体.拖鞋;
import 设计模式.抽象工厂模式.实体.皮鞋;
import 设计模式.抽象工厂模式.实体.跑鞋;
import 设计模式.抽象工厂模式.实体.鞋;
import 设计模式.抽象工厂模式.工厂.抽象工厂;
import 设计模式.抽象工厂模式.工厂.衣服工厂;
import 设计模式.抽象工厂模式.工厂.鞋子工厂;

public class 超级工厂类 {

    public static 抽象工厂 获取指定工厂(String 工厂类别名){
        抽象工厂 工厂 = null;
        // 通过使用者传来的字符串来判断创建一个什么样的产品工厂
        switch (工厂类别名){
            case "xzgc":
                工厂 = new 鞋子工厂();
                break;
            case "yfgc":
                工厂 = new 衣服工厂();
                break;
        }
        // 超级工厂返回创建好的产品工厂
        return 工厂;
    }
}

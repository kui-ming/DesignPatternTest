package 设计模式.建造者模式;

import java.util.ArrayList;
import java.util.List;

public class 套餐类 {
    private String 套餐名;
    private List<食物类> 食物列表 = new ArrayList<>();
    private Double 价格;

    public void 设置套餐名(String 套餐名){
        this.套餐名 = 套餐名;
    }

    public void 添加食物(食物类 食物){
        食物列表.add(食物);
    }

    public void 展示套餐(){
        System.out.println(套餐名 + "：");
        价格 = 0d;
        for (食物类 食物 : 食物列表) {
            System.out.println("  " + 食物.获取名称() + "\t单价：" + 食物.获取价格());
            价格 += 食物.获取价格();
        }
        System.out.println("套餐价格：" + 价格);
    }
}

package 设计模式.建造者模式.优化;

import 设计模式.建造者模式.套餐类;
import 设计模式.建造者模式.食物类;

public class 套餐建造者类 {

    private 套餐类 套餐;

    private 套餐建造者类(){
        // 可以直接在此方法中新建套餐，用new方法创建建造者。但我喜欢使用静态方法来创建，实现全部链式调用
    }

    /**
     * 初始化操作
     * @return
     */
    public static 套餐建造者类 准备套餐(){
        套餐建造者类 建造者 = new 套餐建造者类();
        建造者.套餐 = new 套餐类();
        return 建造者;
    }

    public 套餐建造者类 设置套餐名(String 套餐名){
        套餐.设置套餐名(套餐名);
        return this;
    }

    private void 添加食物(String 食物名, Double 价格){
        食物类 食物 = new 食物类();
        食物.设置名称(食物名);
        食物.设置价格(价格);
        套餐.添加食物(食物);
    }

    public 套餐建造者类 添加霸王鸡腿堡(){
        添加食物("霸王鸡腿堡",12d);
        return this;
    }

    public 套餐建造者类 添加双层霸王鸡腿堡(){
        添加食物("双层霸王鸡腿堡",16d);
        return this;
    }

    public 套餐建造者类 添加薯条(){
        添加食物("薯条",10d);
        return this;
    }

    public 套餐建造者类 添加上校鸡块(){
        添加食物("上校鸡块",10d);
        return this;
    }

    public 套餐建造者类 添加可乐(String 大小){
        // 模拟更复杂的创建方法
        String 名称 = 大小 + "可乐";
        Double 价格 = 4d;
        价格 = 大小.equals("小杯") ? 2d : 价格;
        价格 = 大小.equals("大杯") ? 5d : 价格;
        添加食物(名称, 价格);
        return this;
    }

    public 套餐类 建造完成(){
        return 套餐;
    }


}

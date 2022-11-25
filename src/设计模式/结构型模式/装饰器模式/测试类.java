package 设计模式.结构型模式.装饰器模式;

public class 测试类 {
    public static void main(String[] args) {
        // 开始组装第一台机甲
        System.out.println("开始组装第一台机甲：爱国机甲");
        机甲类 爱国机甲 = new 机甲类();
        // 对爱国机甲进行装饰
        爱国机甲 = new 自动追踪导弹模块(爱国机甲);
        爱国机甲 = new 微型核能续航模块(爱国机甲);
        爱国机甲 = new 钛合金装甲模块(爱国机甲);
        // 展示爱国机甲
        爱国机甲.展示();

        System.out.println("——————————————————————————————————");
        // 组装第二台机甲，对被装饰类进行不同的装饰
        System.out.println("开始组装第二台机甲：友善机甲");
        机甲类 友善机甲 = new 机甲类();
        // 对友善机甲进行装饰
        友善机甲 = new 重装弱重力推进器(友善机甲);
        友善机甲 = new 钛合金装甲模块(友善机甲);
        友善机甲 = new 多功能组合臂模块(友善机甲);
        友善机甲 = new 微型核能续航模块(友善机甲);
        友善机甲 = new 自动追踪导弹模块(友善机甲);
        // 展示友善机甲
        友善机甲.展示();

    }
}

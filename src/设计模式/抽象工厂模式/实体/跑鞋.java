package 设计模式.抽象工厂模式.实体;

public class 跑鞋 extends 鞋 {
    public 跑鞋(){
        System.out.println("开始生产一双跑鞋……");
    }
    @Override
    public void 属性() {
        System.out.println("这是一双跑步时穿的跑鞋，鞋码为"+this.鞋码+"，颜色为"+this.颜色);
    }
}

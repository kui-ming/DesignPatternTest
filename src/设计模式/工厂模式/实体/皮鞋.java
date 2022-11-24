package 设计模式.工厂模式.实体;

public class 皮鞋 extends 鞋 {
    public 皮鞋(){
        System.out.println("开始生产一双皮鞋……");
    }
    @Override
    public void 属性() {
        System.out.println("这是一双打工时穿的皮鞋，鞋码为"+this.鞋码+"，颜色为"+this.颜色);
    }
}

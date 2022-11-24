package 设计模式.抽象工厂模式.实体;

public class 拖鞋 extends 鞋 {

    public 拖鞋(){
        System.out.println("开始生产一双拖鞋……");
    }

    @Override
    public void 属性() {
        System.out.println("这是一双收租的时候穿的拖鞋，鞋码为"+this.鞋码+"，颜色为"+this.颜色);
    }
}

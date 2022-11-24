package 设计模式.抽象工厂模式.实体;

public class 毛衣 extends 衣服{

    public 毛衣() {
        System.out.println("正在制作衣服……");
    }

    @Override
    public void 属性() {
        System.out.println("这是一件毛衣，尺码为"+this.尺码+"，颜色为"+this.颜色);
    }
}

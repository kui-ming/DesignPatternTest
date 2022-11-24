package 设计模式.抽象工厂模式.实体;

public class 卫衣 extends 衣服{

    public 卫衣() {
        System.out.println("正在制作衣服……");
    }

    @Override
    public void 属性() {
        System.out.println("这是一件卫衣，尺码为"+this.尺码+"，颜色为"+this.颜色);
    }
}

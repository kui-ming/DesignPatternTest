package 设计模式.抽象工厂模式.实体;

public class 衬衫 extends 衣服{

    public 衬衫() {
        System.out.println("正在制作衣服……");
    }

    @Override
    public void 属性() {
        System.out.println("这是一件衬衫，尺码为"+this.尺码+"，颜色为"+this.颜色);
    }
}

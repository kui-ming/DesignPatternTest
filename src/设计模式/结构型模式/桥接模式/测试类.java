package 设计模式.结构型模式.桥接模式;

public class 测试类 {
    public static void main(String[] args) {

        圆形 红色圆形 = new 圆形(new 红色());
        红色圆形.绘制();
        方形 蓝色方形 = new 方形(new 蓝色());
        蓝色方形.绘制();
        圆形 蓝色圆形 = new 圆形(new 蓝色());
        蓝色圆形.绘制();
        方形 红色方形 = new 方形(new 红色());
        红色方形.绘制();
    }
}

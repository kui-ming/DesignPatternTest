package 设计模式.结构型模式.享元模式;

public class 客户程序类 {

    private static final String[] 颜色列表 = new String[]{"红","黄","蓝","绿","黑"};

    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            坐标类 随机坐标 = new 坐标类(Math.random()*100, Math.random() * 100);
            圆形类 圆形 = (圆形类) 图形工厂类.获取图形(获取随机颜色());
            圆形.设置半径(Math.random()*100);
            圆形.绘画(随机坐标);
        }
    }

    private static String 获取随机颜色(){
        return 颜色列表[(int) (Math.random()*颜色列表.length)];
    }

}

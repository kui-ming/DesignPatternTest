package 设计模式.结构型模式.享元模式;

/**
 * 非享元角色，它以参数的形式注入具体享元的相关方法中
 */
public class 坐标类 {
    private Double 坐标x, 坐标y;

    public 坐标类(Double 坐标x, Double 坐标y) {
        this.坐标x = 坐标x;
        this.坐标y = 坐标y;
    }

    public Double 获取坐标x() {
        return 坐标x;
    }

    public Double 获取坐标y() {
        return 坐标y;
    }
}

package 实现关系;

public class 车 implements 交通工具 {
    @Override
    public void move() {
        System.out.println("在陆地上行驶");
    }
}

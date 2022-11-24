package 设计模式.抽象工厂模式.实体;

public abstract class 衣服 {
    public Integer 尺码;
    public String 颜色;

    public void 设置衣服大小(Integer 尺码) {
        System.out.println("衣服大小裁剪成功！");
        this.尺码 = 尺码;
    }

    public void 染色(String 颜色) {
        this.颜色 = 颜色;
        System.out.println("衣服染色成功！");
    }

    public abstract void 属性();
}

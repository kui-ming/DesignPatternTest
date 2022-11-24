package 设计模式.抽象工厂模式.实体;

public abstract class 鞋 {

    public Integer 鞋码;
    public String 颜色;


    public void 设置鞋码(Integer 鞋码) {
        System.out.println("鞋子大小设置成功！");
        this.鞋码 = 鞋码;
    }

    public void 染色(String 颜色) {
        this.颜色 = 颜色;
        System.out.println("鞋子染色成功！");
    }

    public abstract void 属性();
}

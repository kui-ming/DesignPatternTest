package 设计模式.建造者模式;

public class 食物类 {
    private String 名称;
    private Double 价格;

    public void 设置名称(String 名称) {
        this.名称 = 名称;
    }

    public void 设置价格(Double 价格) {
        this.价格 = 价格;
    }

    public String 获取名称() {
        return 名称;
    }

    public Double 获取价格() {
        return 价格;
    }
}

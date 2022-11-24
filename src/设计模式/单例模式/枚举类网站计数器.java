package 设计模式.单例模式;

public enum 枚举类网站计数器 {
    唯一实例;
    private int 网站点击数;

    public void 点击数增加(){
        this.网站点击数 += 1;
    }

    public int 获取点击数(){
        return this.网站点击数;
    }
}

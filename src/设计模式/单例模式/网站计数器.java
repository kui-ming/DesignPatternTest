package 设计模式.单例模式;

public class 网站计数器 {

    /*线程安全懒汉式创建单例*//*

    // 用静态属性存储单例对象
    private static 网站计数器 唯一实例 ;

    private int 网站点击数;

    // 将该类的构造方法设置为私有，导致无法在外部创建对象
    private 网站计数器(){ }

    // 获取唯一实例的静态方法
    public static synchronized 网站计数器 获取唯一实例(){
        // 不存在唯一实例时先创建实例
        if (唯一实例 == null){
            唯一实例 = new 网站计数器();
        }
        return 唯一实例;
    }*/


    /* 线程不安全的懒汉式创建单例 *//*
    // 用静态属性存储单例对象
    private static 网站计数器 唯一实例 ;
    private int 网站点击数;

    // 将该类的构造方法设置为私有，导致无法在外部创建对象
    private 网站计数器(){ }

    // 获取唯一实例的静态方法
    public static 网站计数器 获取唯一实例(){
        // 不存在唯一实例时先创建实例
        if (唯一实例 == null){
            唯一实例 = new 网站计数器();
        }
        return 唯一实例;
    }*/

    /* 饿汉式创建单例 *//*
    // 用静态属性存储单例对象
    private static 网站计数器 唯一实例 = new 网站计数器();
    private int 网站点击数;

    // 将该类的构造方法设置为私有，导致无法在外部创建对象
    private 网站计数器(){ }

    // 获取唯一实例的静态方法
    public static 网站计数器 获取唯一实例(){
        return 唯一实例;
    }*/

    /* *//* 双检锁创建单例 *//*
    // 用静态属性存储单例对象
    private static 网站计数器 唯一实例;
    private int 网站点击数;

    // 将该类的构造方法设置为私有，导致无法在外部创建对象
    private 网站计数器(){ }

    // 获取唯一实例的静态方法
    public static 网站计数器 获取唯一实例(){
        // 如果唯一实例已经创建则直接返回实例
        if (唯一实例 == null){
            // 多个线程同时准备创建实例时，使用同步锁
            synchronized(网站计数器.class){
                // 如果有线程已经创建了实例，那此线程就不再创建了
                if (唯一实例 == null){
                    唯一实例 = new 网站计数器();
                }
            }
        }
        return 唯一实例;
    }*/

    /* 静态内部类创建单例 */
    private int 网站点击数;
    static class 内部类{
        private static final 网站计数器 唯一单例 = new 网站计数器();
    }

    public static final 网站计数器 获取唯一实例(){
        // 只有外部显示调用此方法时，内部类才会被加载，唯一单例对象才会被创建
        return 内部类.唯一单例;
    }

    public void 点击数增加(){
        this.网站点击数 += 1;
    }

    public int 获取点击数(){
        return this.网站点击数;
    }

}

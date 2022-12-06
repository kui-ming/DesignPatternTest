package 设计模式.结构型模式.享元模式;


import java.util.HashMap;

public class 图形工厂类 {

    private static HashMap<String, 图形类> 图形集合 = new HashMap<>() ;

    private 图形工厂类(){}

    public static 图形类 获取图形(String 颜色){
        图形类 图形 = 图形集合.get(颜色);
        // 如果图形集合中没有该共享对象的原型，则创建一个
        if (图形 == null){
            图形 = new 圆形类(颜色);
            图形集合.put(颜色, 图形);
        }
        return 图形;
    }
}

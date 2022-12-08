package 设计模式.结构型模式.代理模式.动态代理.cglib;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // 创建自定义代理对象
        MyCglibProxy myCglibProxy = new MyCglibProxy(new HashMap<String,String>());
        // 获取代理对象
        HashMap<String, String> map = (HashMap) myCglibProxy.getProxy();
        System.out.println("————存储Map数据————");
        map.put("张三","这是正经信息");
        map.put("李四","黄色");
        System.out.println("————读取Map数据————");
        System.out.println("张三的信息："+map.get("张三"));
        System.out.println("李四的信息："+map.get("李四"));

        System.out.println("\n");
        // 新建自定义代理对象
        myCglibProxy = new MyCglibProxy(new ArrayList<String>());
        // 获取代理对象
        ArrayList<String> list = (ArrayList) myCglibProxy.getProxy();
        System.out.println("————存储List数据————");
        list.add("这是正经信息");
        list.add("黄色");
        System.out.println("————读取List数据————");
        list.forEach(System.out::println);
    }
}

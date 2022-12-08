package 设计模式.结构型模式.代理模式.动态代理.jdk;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    /**
     * static Object newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h) 新建一个代理对象
     * loader : 类加载器，一般默认用代理类的类加载器，为null也可以
     * inerfaces： 代理对象需要实现的接口类
     * InvocationHandler： 代理方法的实现类
     *
     * 使用Proxy代理要求代理类必须实现某个接口，Proxy会动态创建实现这个接口的代理类，所以也只能使用接口定义的方法
     * 就和静态代理的结构一样，只不过现在不需要手动创建代理类而是动态生成
     * 此示例中的HashMap实现的Map接口，ArrayList实现的List的接口，他们的代理对象也是实现这两个接口
     */

    public static void main(String[] args) {
        // 创建代理对象，代理对象中必须维护一个真实对象，值都存在真实对象上
        MyProxy myProxy = new MyProxy(new HashMap<String,String>());
        Map<String, String> map = (Map) Proxy.newProxyInstance(Map.class.getClassLoader(),new Class[]{Map.class}, myProxy);
        System.out.println("————存储Map数据————");
        map.put("张三","这是正经信息");
        map.put("李四","黄色");
        System.out.println("————读取Map数据————");
        System.out.println("张三的信息："+map.get("张三"));
        System.out.println("李四的信息："+map.get("李四"));

        System.out.println("\n");
        // 新建代理对象，其中必须维护一个真实对象，值都存在真实对象上
        myProxy = new MyProxy(new ArrayList<String>());
        List<String> list = (List) Proxy.newProxyInstance(myProxy.getClass().getClassLoader(),new Class[]{List.class},myProxy);
        System.out.println("————存储List数据————");
        list.add("这是正经信息");
        list.add("黄色");
        System.out.println("————读取List数据————");
        list.forEach(System.out::println);


    }
}

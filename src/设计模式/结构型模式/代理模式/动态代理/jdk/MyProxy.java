package 设计模式.结构型模式.代理模式.动态代理.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK的Proxy方式代理
 * 自定义的代理类，其中必须维护一个真实对象，并且实现InvocationHandler接口
 * 此代理对象其实是代理接口，通过动态实现代理接口来实现对真实对象的代理
 */
public class MyProxy implements InvocationHandler {

    private Object bean;

    public MyProxy(Object bean) {
        // 维护一个真实对象
        this.bean = bean;
    }

    /**
     * InvocationHandler的实现方法，所有代理对象的请求从这个方法流转到真实对象
     * @param proxy 当前的代理对象
     * @param method 当前需要执行的方法
     * @param args 方法参数列表
     * @return 对接真实对象中方法的返回类型
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 同时代理Map的put方法和List的add方法
        if (method.getName().equals("put") || method.getName().equals("add")){
            String value = null;
            // 如果方法名为put
            if (method.getName().equals("put")){
                System.out.println("map存入的键："+args[0]+"\t 值："+args[1]);
                value = (String) args[1];
            }else { // 不为put肯定为add
                System.out.println("list存入的值："+args[0]);
                value = (String) args[0];
            }
            // List的add方法的返回值是布尔型，所以返回false而不能返回null，而Map的put方法返回值不明确，所以仅考虑add方法
            if (!filter(value)) return false;
        }
        // 调用真实对象的指定方法并返回值 bean：指定真实对象（千万记得是真实对象，填proxy会死循环） args：传参列表
        return method.invoke(bean, args);
    }

    /**
     * 过滤掉黄色信息
     * @param value 原信息
     * @return false 不能通行信息 true 可通行信息
     */
    boolean filter(String value){
        if (value.equals("黄色")){
            System.out.println("好啊！搞黄色，不能存不能存！");
            return false;
        }else{
            System.out.println("很好，没有搞黄色，允许存入");
        }
        return true;
    }
}

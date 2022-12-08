package 设计模式.结构型模式.代理模式.动态代理.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * CGLIB动态代理
 * 通过动态创建一个被代理对象的子类来实现代理，此方法并不需要被代理类实现接口，所以可以用于普通对象的代理
 */
public class MyCglibProxy implements MethodInterceptor {

    private Enhancer enhancer; // 增强类，代理类
    private Object bean; // 真实对象，其实通过invokeSuper方法调用父类方法就行，没必要维护一个真实对象

    public MyCglibProxy(Object bean) {
        // 维护一个真实对象
        this.bean = bean;
        // 代理对象
        enhancer = new Enhancer();
    }

    /**
     * 获取代理对象
     * @return
     */
    public Object getProxy(){
        // 设置父类，也就是要代理的类
        enhancer.setSuperclass(bean.getClass());
        // 设置回调方法，也就是代理类需要执行的方法
        enhancer.setCallback(this);
        // 创建一个代理对象
        return enhancer.create();
    }

    /**
     * 代理转发，所有代理对象的请求从这个方法流转到真实对象
     * @param o 当前代理对象
     * @param method 当前方法
     * @param objects 方法参数列表
     * @param methodProxy 方法代理，通过方法代理调用方法可以提供执行速度
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 同时代理Map的put方法和List的add方法
        if (method.getName().equals("put") || method.getName().equals("add")){
            String value = null;
            if (method.getName().equals("put")){
                System.out.println("map存入的键："+objects[0]+"\t 值："+objects[1]);
                value = (String) objects[1];
            }else {
                System.out.println("list存入的值："+objects[0]);
                value = (String) objects[0];
            }
            // List的add方法的返回值是布尔型，所以返回false而不能返回null，而Map的put方法返回值不明确，所以仅考虑add方法
            if (!filter(value)) return false;
        }
        // jdk的代理调用方式，调用速度比后两者慢，不推荐
        //method.invoke(bean,objects);
        // 调用真实对象的指定方法,但使用FastClass提高了调用效率
        //methodProxy.invoke(bean,objects);
        // 调用当前代理对象的父类(也就是被代理对象)的方法,这样做可以不用维护真实对象(这里不能填真实对象，否则会报异常)
        //methodProxy.invokeSuper(o,objects);
        return methodProxy.invokeSuper(o, objects);
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

package 设计模式.原型模式.原型管理器;

/**
 * 继承克隆接口，这样实现该接口的类都能正常使用克隆方法
 */
public interface Animal extends Cloneable {
    Animal clone();
    String toString();
}

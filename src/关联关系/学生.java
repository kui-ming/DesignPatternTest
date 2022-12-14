package 关联关系;

import java.util.List;

/**
 * 关联关系
 * 关联关系指的是在A类中，可以知道B类的存在(可以在A类中调用B类的属性或方法)，那么A类就关联了B类，如果在B类中也知道A类的存在，那么他们就是**双向关联关系**，如果B类不知道A类的存在，那么他们就是**单向关联关系**。
 *
 * 例如：一个老师通过学生列表属性知道学生的存在，而学生通过班主任属性知道老师的存在，那么他们就存在**双向关联**的关系。学生通过课程列表知道课程类的存在，但课程只是一个抽象的类，并不需要关联学生，所以只有学生关联课程，属于**单向关联**。
 *
 * 画法：双向关联可以使用双箭头加实线指向两个关联类，也可以只用实线。单向关联使用实线连接，箭头指向被关联的类。
 *
 * 另外： 还存在一种自关联关系，例如节点中有next属性指向下一个节点，这就是节点关联了自己。
 */

/**
 * 一个老师通过学生列表属性知道学生的存在，而学生通过班主任属性知道老师的存在，那么他们就存在双向关联的关系
 * 学生通过课程列表知道课程类的存在，但课程只是一个抽象的类，并不需要关联学生，所以只有学生关联课程，属于单向关联
 */
public class 学生 {
    public 老师 班主任;
    public List<课程> 课程列表;
}

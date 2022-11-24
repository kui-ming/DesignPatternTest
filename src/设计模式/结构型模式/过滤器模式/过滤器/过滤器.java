package 设计模式.结构型模式.过滤器模式.过滤器;

import 设计模式.结构型模式.过滤器模式.员工;

import java.util.List;

public interface 过滤器 {
    List<员工> 满足标准(List<员工> 员工列表);
}

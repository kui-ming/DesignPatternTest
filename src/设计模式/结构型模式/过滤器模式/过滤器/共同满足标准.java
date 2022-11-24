package 设计模式.结构型模式.过滤器模式.过滤器;

import 设计模式.结构型模式.过滤器模式.员工;

import java.util.List;

public class 共同满足标准 implements 过滤器 {

    public 过滤器 标准一;
    public 过滤器 标准二;

    public 共同满足标准(过滤器 标准一, 过滤器 标准二) {
        this.标准一 = 标准一;
        this.标准二 = 标准二;
    }

    @Override
    public List<员工> 满足标准(List<员工> 员工列表) {
        return 标准二.满足标准(标准一.满足标准(员工列表));
    }
}

package 设计模式.结构型模式.过滤器模式.过滤器;

import 设计模式.结构型模式.过滤器模式.员工;

import java.util.List;

public class 任意满足标准 implements 过滤器 {

    public 过滤器 标准一;
    public 过滤器 标准二;

    public 任意满足标准(过滤器 标准一, 过滤器 标准二) {
        this.标准一 = 标准一;
        this.标准二 = 标准二;
    }

    @Override
    public List<员工> 满足标准(List<员工> 员工列表) {
        List<员工> 满足标准列表一 = 标准一.满足标准(员工列表);
        List<员工> 满足标准列表二 = 标准二.满足标准(员工列表);
        for (员工 人员 : 满足标准列表二) {
            // 如果满足标准列表二中的人员不存在于满足标准列表一，那就添加到满足标准列表一
            if(!满足标准列表一.contains(人员)){
                满足标准列表一.add(人员);
            }
        }
        return 满足标准列表一;
    }
}

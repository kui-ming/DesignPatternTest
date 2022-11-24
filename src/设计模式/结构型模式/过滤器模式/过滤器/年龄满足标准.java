package 设计模式.结构型模式.过滤器模式.过滤器;

import 设计模式.结构型模式.过滤器模式.员工;

import java.util.List;
import java.util.stream.Collectors;

public class 年龄满足标准  implements 过滤器 {

    // 回调接口
    public interface 比较接口{
        boolean 比较(Integer 目标年龄);
    }

    private 比较接口 比较器;


    public 年龄满足标准(比较接口 比较器) {
        this.比较器 = 比较器;

    }

    @Override
    public List<员工> 满足标准(List<员工> 员工列表) {
        return 员工列表.stream().filter(人员->比较器.比较(人员.获取年龄())).collect(Collectors.toList());
    }
}

package 设计模式.结构型模式.过滤器模式.过滤器;

import 设计模式.结构型模式.过滤器模式.员工;

import java.util.List;
import java.util.stream.Collectors;

public class 男性满足标准 implements 过滤器 {

    @Override
    public List<员工> 满足标准(List<员工> 员工列表) {
        // 先把数据转为流，在流中留下所有性别为0的对象，然后再转为List
        return 员工列表.stream().filter(人员->人员.获取性别() == 0).collect(Collectors.toList());
    }
}

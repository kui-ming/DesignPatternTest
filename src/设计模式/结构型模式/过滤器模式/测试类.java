package 设计模式.结构型模式.过滤器模式;

import 设计模式.结构型模式.过滤器模式.过滤器.*;

import java.util.ArrayList;
import java.util.List;

public class 测试类 {
    public static void main(String[] args) {
        // 创建员工列表
        List<员工> 员工列表 = 读取员工列表();
        List<员工> 测试列表 = new ArrayList<>();
        System.out.println("过滤前的人员列表：");
        员工列表.forEach(System.out::println);
        System.out.println("\n");

        // 进行年龄比较
        过滤器 年龄过滤器 = new 年龄满足标准(new 年龄满足标准.比较接口() {
            @Override
            public boolean 比较(Integer 目标年龄) {
                // 目标年龄大于18
                return 目标年龄 >= 25;
            }
        });
        测试列表 = 年龄过滤器.满足标准(员工列表);
        System.out.println("年龄大于或等于25岁的人员列表：");
        测试列表.forEach(System.out::println);
        System.out.println("\n");

        // 满足上面的年龄比较的男性员工
        过滤器 共同满足过滤器 = new 共同满足标准(年龄过滤器, new 女性满足标准());
        测试列表 = 共同满足过滤器.满足标准(员工列表);
        System.out.println("经过年龄标准和女性标准共同过滤后的人员列表：");
        测试列表.forEach(System.out::println);
        System.out.println("\n");

        // 满足上面年龄比较或性别为1的员工
        过滤器 任意满足过滤器 = new 任意满足标准(年龄过滤器, new 女性满足标准());
        测试列表 = 任意满足过滤器.满足标准(员工列表);
        System.out.println("满足年龄标准或性别为女性的人员列表：");
        测试列表.forEach(System.out::println);
    }

    static List<员工> 读取员工列表(){
        // 模拟读取员工数据
        List<员工> 员工列表 = new ArrayList<>();
        员工列表.add(new 员工("一号测试人员", (byte) 0,26));
        员工列表.add(new 员工("二号测试人员", (byte) 1,18));
        员工列表.add(new 员工("三号测试人员", (byte) 0,35));
        员工列表.add(new 员工("四号测试人员", (byte) 1,17));
        员工列表.add(new 员工("五号测试人员", (byte) 1,25));
        员工列表.add(new 员工("六号测试人员", (byte) 0,31));
        员工列表.add(new 员工("七号测试人员", (byte) 0,22));
        return 员工列表;
    }
}

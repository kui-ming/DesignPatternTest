package 设计模式.结构型模式.过滤器模式;

public class 员工 {
    private String 姓名;
    private Byte 性别 = 2; // 0为男 1为女 2为保密
    private Integer 年龄;

    public 员工(String 姓名, Byte 性别, Integer 年龄) {
        this.姓名 = 姓名;
        this.性别 = 性别;
        this.年龄 = 年龄;
    }

    public String 获取姓名() {
        return 姓名;
    }

    public Byte 获取性别() {
        return 性别;
    }

    public Integer 获取年龄() {
        return 年龄;
    }


    @Override
    public String toString() {
        return "员工{" +
                "姓名='" + 姓名 + '\'' +
                ", 性别=" + (性别 == 1 ? "女" : 性别 == 0 ? "男" : "保密") +
                ", 年龄=" + 年龄 +
                '}';
    }
}

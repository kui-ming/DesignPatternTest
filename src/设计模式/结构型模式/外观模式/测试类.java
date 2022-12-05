package 设计模式.结构型模式.外观模式;

public class 测试类 {
    public static void main(String[] args) {
        // 回家先把水烧上
        new 烧水功能类().开始();
        // 再扫地
        new 扫地功能类().开始();
        // 然后拖地
        new 拖地功能类().开始();
        // 最后抹尘
        new 抹尘功能类().开始();
    }
}

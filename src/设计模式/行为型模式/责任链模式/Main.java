package 设计模式.行为型模式.责任链模式;

import java.util.Scanner;

public class Main {
    // 模拟客户程序，在此类中调用实现责任链模式的对象
    public static void main(String[] args) {
        // 新建游戏菜单，他包含三个接收者对象：开始、环境、帮助
        GameMenu gameMenu = new StartMenu();
        gameMenu.addMenu(new SettingMenu());
        gameMenu.addMenu(new HelpMenu());
        // 与玩家交互
        System.out.print("请输入指令：");
        Scanner scanner = new Scanner(System.in);
        String instruct = scanner.next();
        // 按照玩家指令开始寻找匹配的对象进行执行
        gameMenu.execute(instruct);
    }
}

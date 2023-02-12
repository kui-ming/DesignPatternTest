package 设计模式.行为型模式.责任链模式;

public class HelpMenu extends GameMenu {
    @Override
    public void execute(String instruct) {
        if (!instruct.equals("打开帮助")){
            // 玩家指令不是“打开帮助”时，交由下一个接受者除了指令
            next(instruct);
            return;
        }
        System.out.println("帮助模块开始执行！");
    }
}

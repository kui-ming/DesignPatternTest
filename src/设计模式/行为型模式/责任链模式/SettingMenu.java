package 设计模式.行为型模式.责任链模式;

public class SettingMenu extends GameMenu {
    @Override
    public void execute(String instruct) {
        if (!instruct.equals("打开设置")){
            // 玩家指令不是“打开设置”时，交由下一个接受者除了指令
            next(instruct);
            return;
        }
        System.out.println("环境设置模块开始执行！");
    }
}

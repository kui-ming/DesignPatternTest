package 设计模式.行为型模式.责任链模式;

public class StartMenu extends GameMenu {
    @Override
    public void execute(String instruct) {
        if (!instruct.equals("开始游戏")){
            // 玩家指令不是“开始游戏”时，交由下一个接受者除了指令
            next(instruct);
            return;
        }
        System.out.println("游戏开始执行！");
    }
}

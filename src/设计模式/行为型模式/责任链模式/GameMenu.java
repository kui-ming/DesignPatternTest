package 设计模式.行为型模式.责任链模式;

public abstract class GameMenu {

    protected GameMenu nextMenu; // 链中的下一个节点

    /**
     * 组成责任链的方法，将多个继承自GameMenu类的对象组合成链
     * @param option
     */
    public void addMenu(GameMenu option){
        if (nextMenu != null) {
            // 后面有对象时，将新入链的对象往后继续传递
            nextMenu.addMenu(option);
        }
        else {
            // 后面没对象时，将新对象入链
            nextMenu = option;
        }
    }

    /**
     * 抽象执行方法
     * @param instruct 字符串指令
     */
    public abstract void execute(String instruct);

    /**
     * 当前接收者不匹配指令时，将指令传递个下一个接受者
     * @param instruct
     */
    public void next(String instruct){
        // 下一个接受者存在则传递指令，不存在则返回提示信息
        if (nextMenu!=null) nextMenu.execute(instruct);
        else System.out.println("您输入的是无效指令！");
    }
}

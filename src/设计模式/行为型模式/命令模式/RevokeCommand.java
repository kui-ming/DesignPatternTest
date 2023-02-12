package 设计模式.行为型模式.命令模式;

public class RevokeCommand implements Command {

    private TextBox textBox; // 在撤销命令中维护接收者（文本框）

    public RevokeCommand(TextBox textBox) {
        this.textBox = textBox;
    }

    @Override
    public boolean execute() {
        // 执行调用者的撤销方法
        if (textBox != null) textBox.revoke();
        else return false;
        return true;
    }
}

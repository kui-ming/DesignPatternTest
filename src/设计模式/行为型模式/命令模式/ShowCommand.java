package 设计模式.行为型模式.命令模式;

public class ShowCommand implements Command {

    TextBox textBox; // 在显示命令中维护接收者（文本框）

    ShowCommand(TextBox textBox){
        this.textBox = textBox;
    }

    @Override
    public boolean execute() {
        // 执行文本框的显示方法
        if (textBox != null) textBox.print();
        else return false;
        return true;
    }
}

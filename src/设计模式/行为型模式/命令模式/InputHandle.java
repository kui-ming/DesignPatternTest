package 设计模式.行为型模式.命令模式;

/**
 * 模拟一个输入器
 */
public class InputHandle {

    private TextBox textBox; // 指定一个文本框，用于键入文本
    private String text = ""; // 模拟缓存区文本

    public InputHandle(TextBox textBox){
        this.textBox = textBox; // 维护一个文本框
    }

    public void setText(String text){ // 设置输入器的缓存文字
        this.text += text;
    }

    /**
     * 键入方法，将缓存区的文本通过命令写入到指定文本框中
     */
    public void typing(){
        // 将键入命令实体化，方便文本撤销操作
        // 指定键入命令输出的文本框
        InputCommand command = new InputCommand(textBox);
        // 指定键入命令输入入的文字
        command.setText(text);
        // 如果该命令执行成功，清除缓存
        if (command.execute()) text = "";
    }
}

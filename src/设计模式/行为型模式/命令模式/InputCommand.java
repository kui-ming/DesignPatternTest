package 设计模式.行为型模式.命令模式;

public class InputCommand implements Command {

    private String text; // 待输入的文本
    private TextBox textBox; //

    private int textSize = -1;

    InputCommand(TextBox textBox){
        this.textBox = textBox;
    }

    public void setText(String text) {
        this.text = text;
        textSize = text.length(); // 获得文本长度
    }

    public String getText(){
        return text;
    }

    public int getTextSize() {
        return textSize;
    }

    /**
     * 清除当前对象存储的键入文本信息，节省资源，由文本框调用
     */
    public void clear(){
        text = null;
    }


    @Override
    public boolean execute() {
        // 执行命令，如果文本存在则执行成功，否则执行失败
        if (text != null) textBox.input(this);
        else return false;
        return true;
    }
}

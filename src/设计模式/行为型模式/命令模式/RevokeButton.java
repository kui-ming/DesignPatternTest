package 设计模式.行为型模式.命令模式;

/**
 * 撤销按钮
 */
public class RevokeButton {

    private TextBox textBox; // 维护一个文本框

    public RevokeButton(TextBox textBox){
        this.textBox = textBox;
    }

    public void onClick(){
        // 点击撤销按钮时，新建一条撤销命令，并执行
        new RevokeCommand(textBox).execute();
    }
}

package 设计模式.行为型模式.命令模式;

public class CommandMain {
    public static void main(String[] args) {
        // 新建一个文本框
        TextBox textBox = new TextBox();
        // 新建一个输入器，用来模拟键盘输入
        InputHandle inputHandle = new InputHandle(textBox);
        // 新建一个显示按钮，在按钮中维护显示指令，在显示指令中维护一个文本框，以此达到点击按钮显示文本的操作
        ShowButton showButton = new ShowButton(new ShowCommand(textBox));
        // 新建一个撤销按钮，在撤销按钮中维护一个文本框
        RevokeButton revokeButton = new RevokeButton(textBox);

        //缓存文本“你好世界！”
        inputHandle.setText("你好世界！");
        // 通过键入命令键入到文本框
        inputHandle.typing();
        // 点击按钮，让文本框的内容显示在屏幕上
        showButton.onClick();
        // 再次键入文本
        inputHandle.setText("hello，world!");
        inputHandle.typing();
        showButton.onClick();
        //再次键入文本
        inputHandle.setText("abc!");
        inputHandle.typing();
        showButton.onClick();

        // 点击撤销按钮，在内部执行撤销命令
        revokeButton.onClick();
        // 显示撤销后的文本框文本信息
        showButton.onClick();
        revokeButton.onClick();
        showButton.onClick();
    }
}

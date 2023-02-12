package 设计模式.行为型模式.命令模式;

import java.util.ArrayList;

public class TextBox {

    private String content = ""; // 文本框中的文本

    ArrayList<InputCommand> commandList = new ArrayList<>(); // 等待撤销的键入命令列表

    /**
     * 输入方法，获得待执行命令中的信息，将新的信息添加到当前文本中
     * @param command 待执行的键入命令
     */
    public void input(InputCommand command){
        content += command.getText(); // 获取命令中的文本，添加到当前文本
        command.clear(); // 清除命令中的文本，节省资源
        commandList.add(command); // 将当前命令添加到键入命令列表，方便撤销操作
    }

    /**
     * 撤销方法，为文本框提供撤销操作
     */
    public void revoke(){
        if (commandList.size() < 1) return; // 如果命令列表中没有命令则不执行
        int index = commandList.size() - 1; // 获取最后一条命令的索引
        InputCommand command = commandList.get(index); // 获取最后一条命令
        content = content.substring(0,content.length()-command.getTextSize()); // 进行撤销操作
        commandList.remove(index); // 删除最后一条键入命令
    }

    public void print(){
        // 调用显示器显示文本
        System.out.println(content);
    }

}

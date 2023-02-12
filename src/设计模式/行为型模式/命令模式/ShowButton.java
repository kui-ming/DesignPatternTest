package 设计模式.行为型模式.命令模式;

public class ShowButton {

    private Command command; // 维护一条显示命令

    ShowButton(Command command){
        this.command = command;
    }

    public void onClick(){
        if (command != null) command.execute();
    }
}

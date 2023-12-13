public class Invoke {
    ICommand command;
    public Invoke(ICommand command){
        this.command = command;
    }

    public void execute(){
        command.sweep();    // 启动命令
    }
}

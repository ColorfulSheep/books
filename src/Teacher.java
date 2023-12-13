public class Teacher implements ICommand {

    private Student receiver = null;
    public Teacher(Student receiver){
        this.receiver = receiver;
    }


    @Override
    public void sweep() {   // 发送sweep清扫命令
        receiver.sweeping();
    }
    
}

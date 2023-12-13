public class TestMain {
    public static void main(String[] args) {
        Student student = new Student();    // 定义接收者
        Teacher teacher = new Teacher(student); // 定义命令发送者
        Invoke invoke = new Invoke(teacher);    // 将命令请求加入到请求者对象中
        invoke.execute();   //请求者发送命令
    }
}

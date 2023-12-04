public class TestMain {
    public static void main(String[] args) {
        Observer obs = new Observer(); // 定义观察者对象
        Subject subject = new Subject();    // 定义主题对象
        subject.register(obs); // 在这个主题中添加观察者,只要这个主题发生了变化,所有被注册的观察者都能接收到信息,并更新
        subject.setData("测试");    // 数据变化了
        subject.notifyObserver();   // 观察者改变;
    }
}

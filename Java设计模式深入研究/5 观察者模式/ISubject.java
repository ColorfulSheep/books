/**
 * 主题接口
 */
public interface ISubject {
    public void register(IObserver obs);    // 注册观察者
    public void unregister(IObserver obs); // 撤销观察者
    public void notifyObserver(); // 通知所有观察者
}

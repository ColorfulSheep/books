import java.rmi.Remote;
import java.rmi.RemoteException;
/*
 * 定义抽象主题远程接口ICalc
 * 远程接口需要从Remote接口派生, 且定义的接口方法必须抛出RemoteException异常
 */
public interface ICalc extends Remote {
    float calc(String s) throws RemoteException;
}
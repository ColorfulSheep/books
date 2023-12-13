import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/*
 * RMI远程实现类必须从UnicastRemoteObject派生
 */
public class ServerCalc extends UnicastRemoteObject implements ICalc {

    public ServerCalc() throws RemoteException{
        super();
    }

    @Override
    public float calc(String s) throws RemoteException {
        s += "+0";
        float result = 0;   // 最终结果变量
        float value = 0;    // 拆分字符串对应的浮点变量
        char opcur = '+';   // 当前操作符
        char opnext;
        int start = 0;  // 字符串遍历起始位置
        if(s.charAt(0) == '-'){
            opcur = '-';    // 修改当前操作符
            start = 1;  // 修改字符串串遍历起始位置
        }
        // 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '+' || s.charAt(i) == '-'){
                opnext = s.charAt(i);
                value = Float.parseFloat(s.substring(start, i));    // 按照操作符进行字符串的拆分
                switch (opcur) {
                    case '+':
                        result += value;
                        break;
                    case '-':
                        result -= value;
                        break;
                    default:
                        break;
                }
                start = i + 1; 
                opcur = opnext;
                i = start;
            }
        }
        return result;
    }
}

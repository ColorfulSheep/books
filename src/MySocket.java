import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.Socket;

public class MySocket extends Thread {
    Socket socket;

    public MySocket(Socket socket) {
        this.socket = socket;
    }

    public Object invoke(String registerName, String methodName, Object params[]) throws Exception {
        // 获取注册的对象
        Object object = ServerProxy.map.get(registerName);
        // 形成函数参数序列
        Class<?> class1 = Class.forName(object.getClass().getName());
        Class<?> c[] = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            c[i] = params[i].getClass();
        }
        // 根据反射机制进行方法的执行
        Method method = class1.getMethod(methodName, c);
        return method.invoke(object, params);
    }

    public void run() {
        while (true) {
            try {
                InputStream ins = socket.getInputStream();
                if (ins == null || ins.available() == 0)
                    continue;
                // 前处理
                ObjectInputStream in = new ObjectInputStream(ins);
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                String registname = (String) in.readObject(); // 获得远程对象注册
                // 名称
                String methodname = (String) in.readObject(); // 获得远程调用方法
                // 名称
                Object[] para = (Object[]) in.readObject(); // 获得远程对象方法
                // 参数数组
                // 动态调用主题对象
                Object result = invoke(registname, methodname, para);
                // 后处理
                out.writeObject(result); // 将结果写回客户端
                out.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

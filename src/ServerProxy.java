import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ServerProxy {
    public static Map<String,Object> map = new HashMap<>();
    public void register(String key, Object object){
        map.put(key, object);   // 注册到HashMap映射中
    }

    public void process(int socketNo) throws Exception{
        try (ServerSocket serverSocket = new ServerSocket()) {
            while (true) {
                Socket socket =serverSocket.accept();
                if(socket != null){
                    MySocket mySocket = new MySocket(socket);
                    mySocket.start();
                }
            }
        }
    }

}

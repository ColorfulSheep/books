import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Example {
    static void readData(Object obj) throws IOException {
        // 违规代码: 以String对象的形式返回敏感数据, 会导致数据在不被需要的情况下仍然会存留很久
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("1.txt")));
        // 此处违规
        String data = bufferedReader.readLine();
       
        System.out.println("Data: " + data);
        bufferedReader.close();
    }

    static void readData(String string){
        // 合规代码: 通过缓存区的使用,可使得被读取的数据可以在使用之后被立即清除, 且不会在多个位置进行缓存,只会存在于内存中
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16 * 1024);
        try (FileChannel channel = (new FileInputStream("1.txt")).getChannel();){
            while(channel.read(allocateDirect) >= 0){
                allocateDirect.clear();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) throws IOException {
        readData("123");
        readData(new Object());
    }
}

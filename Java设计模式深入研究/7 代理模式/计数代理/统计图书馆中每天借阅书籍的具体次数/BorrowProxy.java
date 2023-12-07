import java.rmi.server.ExportException;
import java.util.Calendar;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 4 定义借阅代理类
 */
public class BorrowProxy implements IBorrow {
    private Borrow obj;
    private Map<String, Integer> map; // key为借阅的书籍的唯一表水, value为借阅的次数

    public BorrowProxy(Borrow borrow) {
        this.obj = borrow;
        map = new HashMap<>();
    }

    @Override
    public boolean borrow() {
        if (!obj.borrow()) { // 如果借阅失败了
            return false;
        }
        Book book = obj.getBook();
        Integer times = map.get(book.getNO());
        times = (times == null ? 1 : times++); // 如果之前没有借阅过,那么就赋值为1, 反之+ 1
        map.put(book.getNO(), times); // 无则新增,有则加入
        return true;
    }

    public void log() throws Exception{
        Set<String> keySet = map.keySet();
        String key = "";
        String result = "";
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            key = iterator.next();
            result += key + "\t" + map.get(key) + "\n";
        }
        Calendar instance = Calendar.getInstance();
        RandomAccessFile randomAccessFile = new RandomAccessFile("./log.txt", "rw");
        randomAccessFile.seek(randomAccessFile.length());
        randomAccessFile.writeBytes(instance.get(Calendar.YEAR)+"-"+(instance.get(Calendar.MONTH)+1)+"-"+instance.get(Calendar.DAY_OF_MONTH)+"\r\n"); //记录日志时间
        randomAccessFile.writeBytes(result);
        randomAccessFile.close();
    }

}

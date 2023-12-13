/*
 * 指向本地文件流
 */

import java.io.File;
import java.io.FileInputStream;

public class NativeStream extends AbstractStream {
    public NativeStream(String filePath) throws Exception{
        File file = new File(filePath);
        size = (int) file.length();
        in = new FileInputStream(filePath);
    }

    // 其他无关代码
}

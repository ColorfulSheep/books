import java.io.InputStream;

/*
 * 读文本文件类
 */
public class TextReader implements IReader<String> {

    AbstractStream stream;

    

    public TextReader(AbstractStream stream) {
        this.stream = stream;
    }



    @Override
    public String read() throws Exception {
       byte[] bytes = stream.readBytes();
        return bytes.toString();
    }
    
}

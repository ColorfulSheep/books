import java.net.HttpURLConnection;
import java.net.URL;

/*
 * 指向线上的URL文件流
 */
public class URLStream extends AbstractStream {
    public URLStream(String strFile) throws Exception {
        URL url = new URL(strFile);
        in = url.openStream();
        HttpURLConnection urlcon = (HttpURLConnection) url.openConnection();
        size = urlcon.getContentLength();
    }
    // 其他代码
}

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/*
 * 配置文件的读取, 不仅仅是Properties, XMl也可
 */
public class TestMain {
    public static void main(String[] args) throws FileNotFoundException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("./shape.properties")); // 转载配置文件
        String shape = properties.getProperty("shape");
        IShape ishape = null;
         ishape =(IShape) Class.forName(shape).getConstructor().newInstance();
         ShapeProc shapeProc = new ShapeProc(ishape);
         float area = shapeProc.process();
         System.out.println("所求面积为" + area);
         
    }
}
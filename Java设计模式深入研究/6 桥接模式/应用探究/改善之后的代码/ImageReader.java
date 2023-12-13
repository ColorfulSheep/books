/*
 * 读图像类
 */

public class ImageReader implements IReader {

    AbstractStream stream;

    public ImageReader(AbstractStream stream) {
        this.stream = stream;
    }

    @Override
    public Object read() throws Exception {
        return null;
    }
    
}

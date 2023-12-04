import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageRead implements IRead<ImageInfo> {

    @Override
    public ImageInfo read(String... in) {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(new File(in[0]));
            int width = bufferedImage.getWidth();
            int height = bufferedImage.getHeight();
            int rgb[] = new int[width * height];
            // 将图像数据读到result缓冲区
            bufferedImage.getRGB(0, 0, width, height, rgb, width, height);
            ImageInfo imageInfo = new ImageInfo();
            imageInfo.setRGB(rgb);
            imageInfo.setHeight(height);
            imageInfo.setWidth(width);
            return imageInfo;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}

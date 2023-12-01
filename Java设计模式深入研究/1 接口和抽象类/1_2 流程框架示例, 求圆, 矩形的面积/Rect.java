import java.util.Scanner;

public class Rect implements IShape {
    float width, height;

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public boolean input() {
        System.out.println("请输入宽, 高: ");
        Scanner s = new Scanner(System.in);
        width = s.nextFloat();
        height = s.nextFloat();
        return true;
    }
}

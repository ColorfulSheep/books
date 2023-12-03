import java.util.Scanner;

public class Rect implements IShape {
    float width;
    float height;

    public Rect(){}

    @Override
    public boolean input() {
        Scanner s =  new Scanner(System.in);
        System.out.println("请依次输入宽高: ");
        width = s.nextFloat();
        height = s.nextFloat();
        return true;
    }

    @Override
    public float getArea() {
        return width * height;
    }
    
}

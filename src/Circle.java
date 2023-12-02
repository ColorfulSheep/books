import java.util.Scanner;

public class Circle implements IShape {
    float r;

    public Circle(){}

    @Override
    public float getArea() {
        return (float) (Math.PI * r * r);
    }



    @Override
    public boolean input() {
        System.out.println("请输入圆的半径: ");
        Scanner s = new Scanner(System.in);
        r = s.nextFloat();
        return true;
    }

}

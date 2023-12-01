import java.util.Scanner;

public class Circle implements IShape {
    float r; // 输入的内容

    @Override
    public boolean input() {
        System.out.println("请输入半径: ");
        Scanner s = new Scanner(System.in);
        r = s.nextFloat();
        return true;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * r * r; // 求面积具体实现
    }

}

import java.lang.reflect.InvocationTargetException;

public class TestMain {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        IShape shape = null;
        shape = (IShape)Class.forName(args[0]).getConstructor().newInstance();
        ShapeProc shapeProc = new ShapeProc(shape);
        float value = shapeProc.process();
        System.out.println("所求面积为: " + value);
    }
}

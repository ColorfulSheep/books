public class TestMain {
    public static void main(String[] args) throws Exception {
        IShape shape = new Circle();
        ShapeProc shapeProc = new ShapeProc(shape);
        System.out.println("圆面积= " + shapeProc.process());

        IShape shape2 = new Rect();
        ShapeProc shapeProc2 = new ShapeProc(shape2);
        System.out.println("矩形的面积为: " + shapeProc2.process());

    }
}

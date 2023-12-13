public class TestMain {
    public static void main(String[] args) {
        IVisitor v = new CenterVisitor();// 定义求重心具体访问者对象
        Triangle t = new Triangle(0, 0, 2, 0, 0, 2);// 定义三角形对象
        Point pt = (Point) t.accept(v);// 通过访问者对象求三角形重心坐标
        System.out.println(pt.x + "\t" + pt.y);
    }
}

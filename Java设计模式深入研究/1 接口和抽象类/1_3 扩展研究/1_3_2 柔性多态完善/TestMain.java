public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(100);
        Float area = (float) circle.dispatch("getArea", circle);
        Float perimeter = (float) circle.dispatch("getPerimeter", circle);
        System.out.println("面积为" + area);
        System.out.println("周长为" + perimeter);
    }
}

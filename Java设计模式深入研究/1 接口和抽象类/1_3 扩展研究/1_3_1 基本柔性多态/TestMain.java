public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(10.0f);
         Float result =  (float)(circle.dispatch(0, null));
         System.out.println("面积为" + result);
         Float perimeter = (float) circle.dispatch(1, null);
         System.out.println("周长为" + perimeter);
    }
}

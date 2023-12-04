public class TestMain {
    public static void main(String[] args) {
        System.out.println("测试工厂模式");
        TopFactory topFactory = new TopFactory();
        TopCar topCar =(TopCar) topFactory.create();  // 获取TopCar对象实例
        System.out.println(topCar.toString());
    }
}
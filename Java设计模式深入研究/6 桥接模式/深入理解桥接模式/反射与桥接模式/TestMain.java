public class TestMain {
    public static void main(String[] args) throws Exception {
        ThingManager thingManager = new ThingManager();
        AbstractThing thing = thingManager.createThing("Letter one");
        thing.createPost("SimplePost"); // 创建功能类对象
        thing.post();// 执行功能
    }
}

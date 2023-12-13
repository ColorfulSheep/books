/*
 * 测试类
 */
public class TestMain {
    public static void main(String[] args) {
        CellContext c = new CellContext("1380908925", "jin", 1); // 新建手机用户，余额
        c.call();
        c.call();// 打两次电话
        c.save(4);// 又存入4元钱
        c.call();
        c.call();
        c.call();
        c.call(); // 又打4次电话
    }
}

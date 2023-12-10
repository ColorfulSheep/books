import java.io.Console;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Password {

    public static void main(String[] args) throws IOException {
        // 这个不比那个什么Scanner香吗
        Console console = System.console();
        if (console == null) {
            System.err.println("No Console!");
            System.exit(1);
        }

        String username = console.readLine("Please enter your username");
        // 违规代码: 在垃圾收集器回收这个String对象关联的内存之前, 凭证信息会一直处于暴露状态
        String password = console.readLine("Please enter your password");
        // 合规代码: 1 使用readPassword()方法从控制台获取密码信息,我感觉Mysql的登陆就是这么做的
        char[] chars = console.readPassword("Please enter your password! ");
        if (!verify(username, password)) {
            throw new SecurityException("Invalid Credentials");
        }
        if (!verify(username, chars)) {
            throw new SecurityException("参数错误!");
        }
        // 2 手动进行内存敏感数据的回收
        Arrays.fill(chars, ' ');
    }

    private static final boolean verify(String username, String password) {
        if ("LPX".equals(username) && "www".equals(password)) {
            return true;
        }
        return false;
    }

    private static final boolean verify(String username, char[] chars) {
        if ("LPX".equals(username) && chars.toString().equals("WWW")) {
            return true;
        }
        return false;
    }

}

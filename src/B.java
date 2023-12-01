import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过类的构造方法来创建类实例
 */
public class B {
    public B() {
        System.out.println("none!");
    }

    public B(Integer m) {
        System.out.println("this is " + m);
    }

    public B(String s, Integer m) {
        System.out.println(s + ": " + m);
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> classInfo = Class.forName("B");

        // 第一种方法
        Constructor<?>[] constructors = classInfo.getConstructors();
        // 调用无参构造函数
        

        /*
         * constructors的顺序为什么会是这样的呢?
         * 这是因为构造方法编译时类似于栈结构, 先进先出, 所以A()先进栈,也就是0, 再然后是A(Integer m),再然后是后面的内容
         */

        constructors[2].newInstance();
        // 调用一个参数的构造函数
        constructors[1].newInstance(new Object[] { 10 });
        // 调用两个参数的构造函数
        constructors[0].newInstance(new Object[] { "Hello", 1000 });

        System.out.println("\n\n\n");

        // 第二种方法,个人推荐这种方法, 简洁可读性强,没有使用到数组索引
        // 调用无参构造函数
        Constructor<?> c1 = classInfo.getConstructor();
        c1.newInstance();
        // 调用一个参数的构造方法
        // 这个或者下面这种 Constructor<?> c2 = classInfo.getConstructor(new Class[] { Integer.class });
        Constructor<?> c2 = classInfo.getConstructor(Integer.class);
        // 这个或者下面这种 c2.newInstance(new Object[] { 10 });
        c2.newInstance(10);
        // 调用两个参数的构造方法
        Constructor<?> c3 = classInfo.getConstructor(new Class[] { String.class, Integer.class });
        c3.newInstance(new Object[] { "测试", 2000 });
    }
}

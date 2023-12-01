/*
 * 统一形式调用成员方法示例
 * 方法反射主要是利用Class类的getMethod方法,得到Method对象, 然后利用Method类中的invoke方法完成反射方法的执行
 */

import java.lang.reflect.Method;

public class C {
    public void func1() {
        System.out.println("This is fun1");
    }

    public void func2(Integer m) {
        System.out.println("This is fun2: " + m);
    }

    public void func3(String s, Integer m) {
        System.out.println("This is fun3: " + s + m);
    }

    public static void main(String[] args)  throws Exception{
        Class<?> classInfo = Class.forName("C");
        // 调用无参构造函数,生成新的示例对象
         Object obj = classInfo.getConstructor().newInstance();
        Method method = classInfo.getMethod("func1" );
        method.invoke(obj);
        // 调用一个参数的成员函数func2
        Method method2 = classInfo.getMethod("func2", Integer.class);
        method2.invoke(obj, 10);
        //调用两个参数的成员函数func3
        Method method3 = classInfo.getMethod("func3", String.class, Integer.class);
        method3.invoke(obj, "Hello", 200);
    }
}

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射的基本使用
 */
public class A {
    int m;
    public A(){}
    public A(int m){this.m = m;}
    public void func1(){};
    public void func2(){};

    public static void main(String[] args) throws ClassNotFoundException {
        // 加载并初始化指定的类A
        Class<?> classInfo = Class.forName("A");
        // 获取类的构造函数
        Constructor<?>[] constructors = classInfo.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.toString());
        }
        // 获取类的所有变量
        Field[] declaredFields = classInfo.getDeclaredFields();
        for (Field field : declaredFields) {
              System.out.println( field.toString());
        }
        // 获取类的所有方法
        Method[] methods = classInfo.getMethods();
        for (Method method : methods) {
            System.out.println(method.toString());
        }
    }
}

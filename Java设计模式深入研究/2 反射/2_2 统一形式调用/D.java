import java.lang.reflect.Method;

/*
 * 通用方法: 只要知道类名字符串, 方法名字符串, 方法参数值, 就可以通过反射机制执行该方法
 * 这种方法执行的过程与直接的调用方法本身有本质的不同
 */
public class D {
    public static boolean process(String className, String funcName, Object[] params) throws Exception{
        // 获取类信息对象
        Class<?> classInfo = Class.forName(className);
        Class<?> c[] =  new Class[params.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = params[i].getClass();
        }
        // 使用无参构造获取类实例
        Object obj =  classInfo.getConstructor().newInstance();
        // 根据方法名来获取方法信息
        Method method = classInfo.getMethod(funcName, c);
        // 使用invoke来实现方法的实现
        method.invoke(obj,params);
        return true;
    }
}

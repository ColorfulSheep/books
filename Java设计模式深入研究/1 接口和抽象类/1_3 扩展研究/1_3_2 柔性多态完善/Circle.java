import java.util.Vector;

import javax.management.RuntimeErrorException;

public class Circle implements IShape {
    float r;
    public Circle(float r){
        this.r = r;
    }

    static Vector<String> vec = new Vector<>();
    static {
        vec.add("getPerimeter");
        vec.add("getArea");
    }

    private float getArea(Object in) {
        return (float) Math.PI * r * r;
    }

    private float getPerimeter(Object in) {
        return (float) Math.PI * r * 2.0f;
    }

    @Override
    public int query(String strID) {
        int index = vec.indexOf(strID);
        if (index == -1)
            throw new RuntimeException("类实例中没有编写该方法");
        return index;
    }

    // 多态方法
    @Override
    public Object dispatch(String strID, Object in) {
        int query = query(strID);
        Object obj = null;
        switch (query) {
            case 0:
                obj = getArea(in);
                break;
            case 1:
                obj = getPerimeter(in);
        }

        return obj;

    }

}

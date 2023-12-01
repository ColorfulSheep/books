public class Rect implements IShape{

    float width, height;


    // 普通的类方法,而非多态方法
    float getArea(Object in){
        return (float) (width * height);
    }
    float getPerimeter(Object in){
        return (width + height) * 2.0f;
    }


    @Override
    public Object dispatch(int nID, Object in) {
        Object obj = null;
        switch (nID) {
            case 0:
                obj = getArea(in);
                break;
            case 1:
                obj = getPerimeter(in);
        }
        return obj;
    }
    
}

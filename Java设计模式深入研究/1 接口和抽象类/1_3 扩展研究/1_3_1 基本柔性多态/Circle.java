public class Circle implements IShape {

    float r;

    public Circle(float r){
        this.r = r;
    }

    private float getArea(Object in){
        return (float) Math.PI * r * r;
    }
    
    private float getPerimeter(Object in){
        return (float) Math.PI * r * 2.0f;
    }


    // 多态方法
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

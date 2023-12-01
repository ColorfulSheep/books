public class ShapeProc implements IShape {

    

    private float getArea(){

    }


    @Override
    public Object dispatch(int nID, Object in) {
        Object obj = null;
        switch (nID) {
            case 0:
                obj = getArea(in);
                break;
        
            default:
                break;
        }
        return obj;
    }
    
}

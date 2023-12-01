public class ShapeProc  {
    private IShape shape;
    public ShapeProc(IShape shape){
        this.shape = shape;
    }
    public float process(){
        shape.input();
        float area = shape.getArea();
        return area;
    }
}

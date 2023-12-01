/*
 * 流程处理类
 */
public class ShapeProc {
    private IShape shape;
    public ShapeProc(IShape shape){
        this.shape = shape;
    }
    public float process(){ // 求面积
        shape.input();
        float value = shape.getArea(); // 计算面积功能
        return value; // 返回面积
    }

}

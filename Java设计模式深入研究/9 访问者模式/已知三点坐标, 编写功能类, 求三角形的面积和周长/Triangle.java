public class Triangle implements IShape {

    float x1, y1, x2, y2, x3, y3; // 三角形三点坐标

    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public float getDist(float u1, float v1, float u2, float v2) { // 求任意两点距离
        return (float) Math.sqrt((u1 - u2) * (u1 - u2) + (v1 - v2) * (v1 - v2));
    }

    @Override
    public Object accept(IVisitor v) { // 可扩展需求分析
        return v.visit(this);
    }

    @Override
    public float getArea() { // 固定需求分析求面积
        float a = getDist(x1, y1, x2, y2);
        float b = getDist(x1, y1, x3, y3);
        float c = getDist(x2, y2, x3, y3);
        float s = (a + b + c) / 2;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));// 海伦公式求面积
    }

    @Override
    public float getLength() { // 固定需求分析求周长
        float a = getDist(x1, y1, x2, y2);
        float b = getDist(x1, y1, x3, y3);
        float c = getDist(x2, y2, x3, y3);
        return a + b + c;
    }

}

public interface IShape {
    float getArea();    // 明确需求分析
    float getLength();  // 明确的需求分析
    Object accept(IVisitor v);  // 可扩展的需求分析
}

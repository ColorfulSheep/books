/*
 * 基本的柔性多态, 相比于1_2
 */
public interface IShape {
    public Object dispatch(int nID, Object in);
}

/**
 * @author 彩羊
 * @desc IntelliJ IDEA
 * @since 2023/12/01 09:08
 */
public class Algo<T> {
    public T getMax(T[] t, ILess<T> cmp) {
        T maxValue = t[0];
        for (T value : t) {
            if (cmp.less(maxValue, value)) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}

/**
 * @author 彩羊
 * @desc IntelliJ IDEA
 * @since 2023/12/01 09:20
 */
public class InteLess implements ILess<Integer> {
    @Override
    public boolean less(Integer x, Integer y) {
        return x < y;
    }
}

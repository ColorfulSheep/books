import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class CollectionCpy <T> {
    // 集合对象的排序实现源码
    public static <T extends Comparable <? super T>> void sort(List<T> list){
        // 先转为数组
        var array = list.toArray();
        // 数组进行排序
        Arrays.sort(array);
        ListIterator<T> iterator = list.listIterator();
        // 新建集合, 填充数据
        for (int i = 0; i < array.length; i++) {
            iterator.next();
            iterator.set((T)array[i]);
        }
    }
}

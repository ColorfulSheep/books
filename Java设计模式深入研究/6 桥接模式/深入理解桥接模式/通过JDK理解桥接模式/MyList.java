import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class MyList <T> {
    List<T> list;

    Object[] arr;

    public MyList(List<T> list){    // 构造函数
        this.list = list;
        this.arr = list.toArray();
    }

    public void sort(){ // 数组的排序
        Arrays.sort(arr);
    }

    public int binarySearch(T key){     // 新增的二分查找
        int pos = Arrays.binarySearch(arr, key);
        return pos;
    }

    public void show(){     // 显示数组的内容
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }

    public void fill(){ // 排序之后将数组填充到集合
        ListIterator<T> listIterator = this.list.listIterator();
        for (int i = 0; i < arr.length; i++) {
            listIterator.next();
            listIterator.set((T)arr[i]);
        }
    }
    
}

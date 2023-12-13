
//透支状态下打电话类
public class OverDrawState implements ICellState {
    public boolean phone(CellContext ct) {
        System.out.println(ct.name + "：已处于欠费状态，请及时缴费");
        int minute = (int) (Math.random() * 10 + 1);
        ct.cost(minute);
        // 保存信息到数据库的透支表中
        return false;
    }
}

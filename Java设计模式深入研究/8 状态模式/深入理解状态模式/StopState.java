//停机类
class StopState implements ICellState {
    public boolean phone(CellContext ct) {
        System.out.println(ct.name + "：已处于停机状态，请及时缴费");
        // 保存信息到数据库
        return false;
    }
}
/*
 * > NORMAL_LIMIT: 正常
 * < STOP_LIMIT: 停机
 * NORMAL_LIMIT >= > STOP_LIMIT: 透支
 */
public interface ICellState {
    public final float NORMAL_LIMIT = 0; // 正常状态
    public final float STOP_LIMIT = -1; // 停机状态
    public final float COST_MINUTE = 0.20f; //话费标准

    public boolean phone(CellContext ct);

}


public class CellContext {
    String strPhone;
    String name;
    float price;

    public CellContext(String phone, String name, float price) {
        this.name = name;
        this.price = price;
        this.strPhone = phone;
    }

    public void save(float price) { // 手机存钱
        this.price += price;
    }

    public void cost(int minute) { // 手机打了n分钟，重新计算余额
        this.price -= ICellState.COST_MINUTE * minute;
    }

    public boolean call() {
        ICellState state = null;
        if (price > ICellState.NORMAL_LIMIT)
            state = new NormalState();
        else if (price < ICellState.STOP_LIMIT)
            state = new StopState();
        else
            state = new OverDrawState();
        state.phone(this); // 调用IState接口中方法，该方法由不同子类实现
        return true;
    }

}

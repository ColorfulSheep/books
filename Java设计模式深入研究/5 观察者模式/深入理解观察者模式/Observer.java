public class Observer implements IObserver <String> {

    private final int mark  = 1;

    @Override
    public int getMark() {
        return mark;
    }

    @Override
    public void refresh(String data) {
        System.out.println("我接受到了信息, 我是String, " + data);
    }

    @Override
    public boolean equals(Object obj) { // 重写equals
        return ((Observer) obj).getMark() == mark;
    }
    
}

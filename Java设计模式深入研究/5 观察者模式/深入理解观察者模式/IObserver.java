public interface IObserver <T> {
    public int getMark();
    public void refresh(T data);
}

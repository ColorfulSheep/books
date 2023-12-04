public class Observer1 implements IObserver<Student> {

    private final int mark = 2;

    @Override
    public int getMark() {
        return mark;
    }

    @Override
    public void refresh(Student data) {
        data.setAge(111);
        System.out.println(data.getName());
        System.out.println(data.getAge());
    }

    @Override
    public boolean equals(Object obj) { // 重写equals
        return ((Observer) obj).getMark() == mark;
    }

    

}

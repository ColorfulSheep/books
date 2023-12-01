/**
 * @author 彩羊
 * @desc IntelliJ IDEA
 * @since 2023/12/01 09:24
 */
public class StudentLess implements ILess<Student> {

    @Override
    public boolean less(Student x, Student y) {
        return x.getGrade() < y.getGrade();
    }
}

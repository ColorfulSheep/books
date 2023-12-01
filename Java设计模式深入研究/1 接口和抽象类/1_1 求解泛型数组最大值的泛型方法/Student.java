/**
 * @author 彩羊
 * @desc IntelliJ IDEA
 * @since 2023/12/01 09:22
 */
public class Student {
    private final String name;
    private final Integer grade;

    public Student(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Integer getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

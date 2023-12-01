/**
 * @author 彩羊
 * @desc IntelliJ IDEA
 * @since 2023/12/01 09:26
 */
public class TestMain {
    public static void main(String[] args) {
        Algo<Integer> integerAlgo = new Algo<>();
        Integer[] integers = {10, 123213, 12312213, 199, 116, 112};
        Integer max = integerAlgo.getMax(integers, new InteLess());
        System.out.println("max = " + max);
        Algo<Student> studentAlgo = new Algo<>();
        Student[] students = {
                new Student("小李子", 120),
                new Student("王德发", 20),
                new Student("电击小子", 320),
                new Student("坤坤", 250),
        };
        Student student = studentAlgo.getMax(students, new StudentLess());
        System.out.println("成绩最高的学生信息 = " + student);

    }
}

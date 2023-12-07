/**
 * 1 定义书籍基本类
 */
public class Book {
    private String NO; // 书号，假设仅有书号、书名两个属性
    private String name; // 书名

    public Book(String NO, String name) {
        this.NO = NO; 
        this.name = name;
    }

    public String getNO() {
        return NO;
    }

    public void setNO(String nO) {
        NO = nO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

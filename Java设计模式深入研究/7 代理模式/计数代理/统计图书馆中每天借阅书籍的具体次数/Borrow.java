/**
 * 3 定义借阅实现类
 */
public class Borrow implements IBorrow {
    private Book book;

    public void setBook(Book book){
        this.book = book;
    }

    public Book getBook(){
        return book;
    }

    @Override
    public boolean borrow() {
        // 保存信息到数据库等相关操作
        return true;
    }
    
}

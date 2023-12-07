public class TestMain {
    public static void main(String[] args) throws Exception {
        Borrow borrow = new Borrow();
        BorrowProxy borrowProxy = new BorrowProxy(borrow);
        Book book = new Book("1000", "计算机运用");
        borrow.setBook(book);
        borrowProxy.borrow();   // 借阅另一本书
        borrowProxy.log();  // 调用记录日志功能
    }
}

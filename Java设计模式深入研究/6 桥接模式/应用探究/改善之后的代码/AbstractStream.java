import java.io.InputStream;

/*
 * 抽象基本类流
 * 将流的共性封装到抽象类中,比如读,写文件, 拒绝重复编写
 * 将差异性的内容封装到各个子类中, 且分别实现各自的不同的功能,实现解耦合, 比如打开文件获取Stream流对象一级如何获取Size
 */
public abstract class AbstractStream {

    protected InputStream in;
    protected int size; // 每次读的大小

    public byte[] readBytes(){
      byte buf[] = new byte[size];
      return buf;
    }

    public void close() throws Exception{
        in.close();
    }

}

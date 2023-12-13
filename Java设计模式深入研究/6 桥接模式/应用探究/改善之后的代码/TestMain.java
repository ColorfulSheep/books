public class TestMain {
    public static void main(String[] args) throws Exception {
        // 打开远程文件流
        AbstractStream in = new URLStream("https://www.baidu.com");
        TextReader textread = new TextReader(in); // 设置读文本文件
        AbstractThing thing = new URLFile(textread); // 设置读远程文件
        String s = (String) thing.read(); // 开始读远程文本文件过程
        in.close();
        System.out.println(s);
    }
}

public class Encrypt extends LogFile {

    private String encrypt(String string){  // 加密具体功能
        return string + "假装加密了";
    }

    public void save(String string){
        string = encrypt(string);
    }
}

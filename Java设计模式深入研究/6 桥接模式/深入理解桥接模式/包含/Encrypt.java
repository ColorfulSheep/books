public class Encrypt {

    LogFile lf;

    public Encrypt(LogFile lf){
        this.lf = lf;
    }

    public String encrypt(String string){
        return string + "我也是假装加密了";
    }


    public void save (String string){
        string = encrypt(string);
    }
    
}

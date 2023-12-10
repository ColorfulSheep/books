public class TestMain {
    public static void main(String[] args) throws Exception {
        ServerCalc serverCalc = new ServerCalc();
        ServerProxy serverProxy = new ServerProxy();
        serverProxy.register("calc", serverCalc);
        serverProxy.process(1);
    }

    


}

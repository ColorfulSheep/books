import java.rmi.Naming;
/*
 * 远程具体实现对象注册类RmiServer
 */
public class RmiServer {
    public static void main(String[] args) {
        if(System.getSecurityManager() == null){
            System.setSecurityManager(new SecurityManager());
            try {
                ServerCalc serverCalc = new ServerCalc();
                Naming.rebind("calc", serverCalc);
                System.out.println("server bind successfully!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

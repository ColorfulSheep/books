public class BuyerProxy implements ITV{

    private Buyer buyer;    // 代理被谁执行

    public BuyerProxy(Buyer buyer){
        this.buyer = buyer;
    }


    @Override
    public void buyTV() {
       preProcess();
       buyer.buyTV();
       postProcess();
        
    }

    public void preProcess(){
        // 询问客户需要的电视信号和价位等购买之前的相关信息
    }

    public void postProcess(){
        // 售后服务
    }
    
}

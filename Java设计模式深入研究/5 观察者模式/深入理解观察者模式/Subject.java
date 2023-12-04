import java.util.Vector;

public class Subject implements ISubject<Object> {

    Vector<IObserver<Object>> vec = new Vector<>();

    private String data;
    
    public String getData(){ // 获取数据实现
        return data;
    }

    public void setData(String data){   // 更新数据实现
        this.data = data;
    }


    @Override
    public void notifyObserver() {
        for (IObserver<Object> obs : vec) {
            if((Student) obs)
            obs.refresh("测试1234567");
        }
    }

    @Override
    public void register(IObserver<Object> obs) {
        if(!vec.contains(obs)){
            vec.add(obs);
        }
        
    }

    @Override
    public void unregister(IObserver<Object> obs) {
        if(vec.contains(obs)){
            vec.remove(obs);
        }
    } 
}

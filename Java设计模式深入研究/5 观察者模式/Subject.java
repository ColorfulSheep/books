import java.util.Vector;

public class Subject implements ISubject{

    private Vector<IObserver> vec = new Vector<>(); // 观察者维护向量
    private String data;
    
    public String getData(){ // 获取数据实现
        return data;
    }

    public void setData(String data){   // 更新数据实现
        this.data = data;
    }


    @Override
    public void notifyObserver() { // 通知所有的观察者进行数据响应
        for (int i = 0; i < vec.size(); i++) {
            IObserver obs = vec.get(i);
            obs.refresh(data); // 具体的修改数据实现在这个refresh中实现
        }
    }

    @Override
    public void register(IObserver obs) { // 注册主题(添加)
        vec.add(obs);
        
    }

    @Override
    public void unregister(IObserver obs) { // 主题撤销
        if(vec.contains(obs)){
            vec.remove(obs);
        }
    }
    
}

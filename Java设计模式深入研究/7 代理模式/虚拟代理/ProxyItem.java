/**
 * 3 代理主题类
 */
public class ProxyItem implements IItem {

    private RealItem item;

    boolean bFill;  // 标识字段content, plan字段是否填充
    public ProxyItem(RealItem item){
        this.item = item;
    }

    @Override
    public String getAccount() {
        return item.getAccount();
    }

    @Override
    public String getContent() {
        return item.getContent();
    }

    @Override
    public String getName() {
        return item.getContent();
    }

    @Override
    public String getPlan() {
        return item.getPlan();
    }

    @Override
    public String getProject() {
        return item.getProject();
    }

    @Override
    public void itemFill() throws Exception {
        if(!bFill){
            item.itemFill();
            bFill = true;
        }
    }

    @Override
    public void setAccount(String account) {
        item.setAccount(account);
        
    }

    @Override
    public void setName(String name) {
        item.setName(name);
        
    }

    @Override
    public void setProject(String project) {
        item.setProject(project);
    }
    
}

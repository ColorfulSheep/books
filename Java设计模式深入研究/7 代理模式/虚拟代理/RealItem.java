/**
 * 2 具体的主题实现类
 */
public class RealItem implements IItem {

    private String account;
    private String name;
    private String project;
    private String content;
    private String plan;

    @Override
    public String getAccount() {
        return account;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPlan() {
        return plan;
    }

    @Override
    public String getProject() {
        return project;
    }

    @Override
    public void itemFill() throws Exception { // 填充项目的content和plan字段
        String sql = ("select content, plan from project where account='" + account + "'");
        // 数据库查询
        System.out.println("sql = " + sql);
    }

    @Override
    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setProject(String project) {
        this.project = project;
    }
    
}

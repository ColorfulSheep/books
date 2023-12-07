import java.util.Vector;

/**
 * 4 代理项目集合类
 */
public class ManageItems {
    Vector<ProxyItem> vec = new Vector<>();

    // 一级查询,获取的是列表
    public void firstSearch(){
        String sql = "select account, name, project from project";
        // 假装执行查询
        System.out.println("执行了一级查询, 查询语句为: " + sql);
    }
}

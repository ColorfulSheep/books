/**
 * 1 抽象主题接口
 */
public interface IItem {
    String getAccount();void setAccount(String account);
    String getName();void setName(String name);
    String getProject();void setProject(String project);
    String getContent();    // 二级查询才能查询到
    String getPlan();       // 二级查询才能查询到


    void itemFill() throws Exception;

}

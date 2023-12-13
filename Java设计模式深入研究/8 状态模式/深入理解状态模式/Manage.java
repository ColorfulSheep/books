/*
 * 使用集合管理类改善程序功能
 * 实际中需要对手机用户对象的集合进行维护
 */

import java.util.HashMap;
import java.util.Map;

public class Manage {
    private Map<String, CellContext> map = new HashMap();

    public boolean register(CellContext ct) {
        map.put(ct.strPhone, ct);
        return true;
    }

    private void save(String strPhoneNO, float money) {
        CellContext cellContext = map.get(strPhoneNO);
        cellContext.save(money);
    }

    public boolean phone(String strPhoneNO) {
        CellContext cellContext = map.get(strPhoneNO);
        cellContext.call();
        return true;
    }

    

}

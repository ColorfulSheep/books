public abstract class AbstractThing {
    IPost obj;

    public void createPost(String reflectName) throws Exception {
        // 利用反射机制加载功能类
        obj = (IPost) Class.forName(reflectName).newInstance();
    }

    public void post() {
        obj.post();
    }
}
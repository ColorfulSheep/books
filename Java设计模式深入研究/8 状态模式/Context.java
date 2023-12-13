/*
 * 实现状态模式的关键类
 */
public class Context {  // 假设上下文有n种状态
    private IState state;
    public void setState(IState state){
        this.state = state;
    }

    public void manage(){
        // 此处代码根据条件选择某种状态
        state.goState();    // 执行某种状态功能
    }
}

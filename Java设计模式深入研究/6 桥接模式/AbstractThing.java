/**
 * 有共享的功能, 也一定有相异的功能
 * 
 */
abstract class AbstractThing {    // 核心功能实现类, 也是桥接模式的核心
    private IPost post; // 抽象事物

    public AbstractThing(IPost post){   // 抽象发送功能
        this.post = post;
    }

    public void post(){
        post.post();
    }
}

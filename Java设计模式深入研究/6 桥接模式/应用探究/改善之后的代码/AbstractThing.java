/*
 * 抽象事物类
 */
public abstract class AbstractThing {
    private IReader reader;

    public AbstractThing(IReader reader) {
        this.reader = reader;
    }

    Object read() throws Exception {
        return reader.read();
    }

    
}

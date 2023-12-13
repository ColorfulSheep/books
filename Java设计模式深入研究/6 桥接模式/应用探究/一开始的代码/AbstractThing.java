public class AbstractThing {
    AbstractReader reader;  // 具备抽象的功能
    public AbstractThing(AbstractReader reader){
        this.reader = reader;
    }

    /*
     * 返回值类型为Object,是为了兼容所有的类型
     */
    Object read(String pathString) throws Exception{
        return reader.read(pathString);
    }
}

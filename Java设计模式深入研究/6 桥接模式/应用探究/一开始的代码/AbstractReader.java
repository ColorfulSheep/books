public abstract class AbstractReader<T> {
    // 参数: 文件地址, 分为线上和本地
    public abstract T read(String strPath) throws Exception;
}

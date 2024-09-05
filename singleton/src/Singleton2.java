/**
 * @author soybean
 * @date 2024/9/5 14:44
 * @description
 */
public class Singleton2 {

    //volatile快速更新内存内的值
    private static volatile Singleton2 instance;

    public String value;

    private Singleton2(String value) {
        this.value = value;
    }

    public static Singleton2 getInstance(String value) {
        Singleton2 result = instance;
        if (result != null) {
            return result;
        }
        //只能有一个线程可以访问
        synchronized(Singleton2.class) {
            if (instance == null) {
                instance = new Singleton2(value);
            }
            return instance;
        }
    }
}

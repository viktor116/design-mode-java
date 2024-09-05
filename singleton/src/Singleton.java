/**
 * @author soybean
 * @date 2024/9/5 14:36
 * @description
 */
public final class Singleton {
    private static Singleton instance;
    public String value;

    //design to private let singleton callback by myself
    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
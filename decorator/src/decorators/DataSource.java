package decorators;

/**
 * @author soybean
 * @date 2024/9/29 17:26
 * @description
 */
public interface DataSource{
    void writeData(String data);

    String readData();
}

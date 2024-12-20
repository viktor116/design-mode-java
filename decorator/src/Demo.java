import decorators.*;

/**
 * @author soybean
 * @date 2024/9/29 15:56
 * @description
 */
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData()); // 这里读取的是加密后的数据
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData()); // 装饰器链中的装饰器会依次调用，最终读取到加密后的数据并解密
    }
}
import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowsDialog;

/**
 * @author soybean
 * @date 2024/8/2 14:28
 * @description
 */
public class Main {
    private static Dialog dialog;
    public static void main(String[] args) {
       configure();
       runBusinessLogic();
    }

    static void configure() {
        String property = System.getProperty("os.name");
        System.out.println("property="+property);
        if (System.getProperty("os.name").startsWith("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
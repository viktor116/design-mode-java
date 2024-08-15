package buttons;

/**
 * @author soybean
 * @date 2024/8/2 16:23
 * @description
 */
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
    }

    @Override
    public void onClick() {
        System.out.println("click! button says - 'Hello World!'");
    }
}

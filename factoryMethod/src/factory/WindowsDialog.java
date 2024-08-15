package factory;

import buttons.Button;
import buttons.HtmlButton;
import buttons.WindowsButton;

/**
 * @author soybean
 * @date 2024/8/2 16:35
 * @description
 */
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

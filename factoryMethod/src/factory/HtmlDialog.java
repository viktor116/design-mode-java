package factory;

import buttons.Button;
import buttons.HtmlButton;

/**
 * @author soybean
 * @date 2024/8/2 16:35
 * @description
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
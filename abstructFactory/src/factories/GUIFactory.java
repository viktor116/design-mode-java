package factories;

import buttons.Button;
import checkboxes.Checkbox;

/**
 * @author soybean
 * @date 2024/8/9 11:07
 * @description
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

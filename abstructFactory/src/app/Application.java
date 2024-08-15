package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

/**
 * @author soybean
 * @date 2024/8/9 11:13
 * @description
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}

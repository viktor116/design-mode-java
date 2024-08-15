package factory;

import buttons.Button;

/**
 * @author soybean
 * @date 2024/8/2 16:30
 * @description
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}
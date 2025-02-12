package components;

import mediator.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * @author soybean
 * @date 2024/11/28 14:58
 * @description
 */
public class TextBox extends JTextArea implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}

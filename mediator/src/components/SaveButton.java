package components;

import mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author soybean
 * @date 2024/11/28 14:58
 * @description
 */
public class SaveButton extends JButton implements Component {
    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
}
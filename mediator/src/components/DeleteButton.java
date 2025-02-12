package components;

import mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author soybean
 * @date 2024/11/28 14:56
 * @description
 */
public class DeleteButton extends JButton implements Component {
    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
}

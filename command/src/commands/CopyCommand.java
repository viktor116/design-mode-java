package commands;

import editor.Editor;

/**
 * @author soybean
 * @date 2024/11/22 15:20
 * @description
 */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
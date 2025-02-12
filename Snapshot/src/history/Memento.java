package history;

import editor.Editor;

/**
 * @author soybean
 * @date 2025/2/12 17:08
 * @description
 */
public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
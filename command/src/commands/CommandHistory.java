package commands;

import java.util.Stack;

/**
 * @author soybean
 * @date 2024/11/22 15:21
 * @description
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
package shapes;

import visitor.Visitor;

/**
 * @author soybean
 * @date 2025/4/11 14:54
 * @description
 */
public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}

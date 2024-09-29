package shapes;

import java.awt.*;

/**
 * @author soybean
 * @date 2024/9/28 14:55
 * @description
 */
public interface Shape{
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}

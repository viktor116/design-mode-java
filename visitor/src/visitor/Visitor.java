package visitor;

import shapes.Circle;
import shapes.CompoundShape;
import shapes.Dot;
import shapes.Rectangle;

/**
 * @author soybean
 * @date 2025/4/11 15:04
 * @description
 */
public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
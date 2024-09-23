package round;

/**
 * @author soybean
 * @date 2024/9/23 14:48
 * @description
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }

}

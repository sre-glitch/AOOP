package five2;

public class Ellipse extends Polygon {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
        System.out.println("Ellipse created with major axis: " + majorAxis + " and minor axis: " + minorAxis);
    }

    @Override
    public double computeArea() {
        System.out.println("Computing area of the ellipse.");
        return Math.PI * majorAxis * minorAxis;
    }
}

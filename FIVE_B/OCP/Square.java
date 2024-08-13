package five2;

public class Square extends Polygon {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
        System.out.println("Square created with side length: " + sideLength);
    }

    @Override
    public double computeArea() {
        System.out.println("Computing area of the square.");
        return sideLength * sideLength;
    }
}

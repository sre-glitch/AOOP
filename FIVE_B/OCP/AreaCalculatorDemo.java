package five2;

public class AreaCalculatorDemo {
    public static void main(String[] args) {
        Polygon square = new Square(4);
        System.out.println("Square area: " + square.computeArea());

        Polygon ellipse = new Ellipse(6, 4);
        System.out.println("Ellipse area: " + ellipse.computeArea());}}

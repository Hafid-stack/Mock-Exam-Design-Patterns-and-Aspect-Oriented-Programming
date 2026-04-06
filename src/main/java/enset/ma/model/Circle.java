package enset.ma.model;

public class Circle extends Figure {

    private Point center;
    private double radius;

    public Circle(Point center,
                  double radius,
                  int thickness,
                  String borderColor,
                  String fillColor) {

        super(thickness, borderColor, fillColor);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {

        System.out.println("Circle: radius=" + radius);
    }
}
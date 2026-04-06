package enset.ma.model;

public class Rectangle extends Figure {

    private Point topLeft;
    private double width;
    private double height;

    public Rectangle(Point topLeft,
                     double width,
                     double height,
                     int thickness,
                     String borderColor,
                     String fillColor) {

        super(thickness, borderColor, fillColor);
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public void draw() {

        System.out.println("Rectangle: width=" + width);
    }
}
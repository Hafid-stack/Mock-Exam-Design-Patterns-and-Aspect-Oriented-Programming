package enset.ma;

import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Group extends Figure {

    private List<Figure> figures = new ArrayList<>();

    public Group(int thickness,
                 String borderColor,
                 String fillColor) {

        super(thickness, borderColor, fillColor);
    }

    public void addFigure(Figure f) {
        figures.add(f);
    }

    public void removeFigure(Figure f) {
        figures.remove(f);
    }

    @Override
    public double area() {

        double total = 0;

        for (Figure f : figures) {
            total += f.area();
        }

        return total;
    }

    @Override
    public double perimeter() {

        double total = 0;

        for (Figure f : figures) {
            total += f.perimeter();
        }

        return total;
    }

    @Override
    public void draw() {

        for (Figure f : figures) {
            f.draw();
        }
    }
}
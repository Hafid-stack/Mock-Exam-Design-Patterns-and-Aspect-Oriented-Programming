package enset.ma.model;

import enset.ma.observer.Configuration;
import enset.ma.observer.Observer;

public abstract class Figure implements Observer {

    protected int thickness;
    protected String borderColor;
    protected String fillColor;

    public Figure(int thickness,
                  String borderColor,
                  String fillColor) {

        this.thickness = thickness;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    public abstract double area();

    public abstract double perimeter();

    public abstract void draw();

    @Override
    public void update(Configuration configuration) {

        this.thickness = configuration.getThickness();
        this.borderColor = configuration.getBorderColor();
        this.fillColor = configuration.getFillColor();
    }

}

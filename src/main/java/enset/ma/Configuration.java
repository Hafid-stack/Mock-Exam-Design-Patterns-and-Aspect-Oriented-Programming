package enset.ma;

import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Configuration {

    private int thickness;
    private String borderColor;
    private String fillColor;

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {

        observers.add(o);
    }

    public void removeObserver(Observer o) {

        observers.remove(o);
    }

    public void notifyObservers() {

        for (Observer o : observers) {
            o.update(this);
        }
    }

    public int getThickness() {
        return thickness;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setThickness(int thickness) {

        this.thickness = thickness;
        notifyObservers();
    }

    public void setBorderColor(String borderColor) {

        this.borderColor = borderColor;
        notifyObservers();
    }

    public void setFillColor(String fillColor) {

        this.fillColor = fillColor;
        notifyObservers();
    }
}
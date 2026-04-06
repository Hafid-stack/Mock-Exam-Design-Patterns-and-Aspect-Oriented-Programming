package enset.ma.model;

import enset.ma.strategy.ProcessingStrategy;

import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

public class Drawing implements Serializable {

    private List<Figure> figures = new ArrayList<>();

    private ProcessingStrategy strategy;

    public void addFigure(Figure f) {

        figures.add(f);
    }

    public void removeFigure(Figure f) {

        figures.remove(f);
    }

    public void display() {

        for (Figure f : figures) {
            f.draw();
        }
    }

    public void setStrategy(ProcessingStrategy strategy) {

        this.strategy = strategy;
    }

    public void process() {

        if (strategy != null) {
            strategy.process(figures);
        }
    }

    public void serialize(String fileName) {

        System.out.println("Serialize drawing to file");
    }
}
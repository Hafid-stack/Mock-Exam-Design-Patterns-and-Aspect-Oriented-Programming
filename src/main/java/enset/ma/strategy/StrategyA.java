package enset.ma.strategy;

import enset.ma.model.Figure;

import java.util.List;

public class StrategyA implements ProcessingStrategy {

    @Override
    public void process(List<Figure> figures) {

        System.out.println("Processing Strategy A");

        for (Figure f : figures) {
            f.draw();
        }
    }
}
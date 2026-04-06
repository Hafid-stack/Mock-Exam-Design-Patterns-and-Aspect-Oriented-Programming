package enset.ma.strategy;

import enset.ma.model.Figure;

import java.util.List;

public class StrategyB implements ProcessingStrategy {

    @Override
    public void process(List<Figure> figures) {

        System.out.println("Processing Strategy B");

        for (Figure f : figures) {
            System.out.println(f.area());
        }
    }
}
package enset.ma.strategy;

import enset.ma.model.Figure;

import java.util.List;

public interface ProcessingStrategy {

    void process(List<Figure> figures);

}
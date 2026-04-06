package enset.ma;

import java.util.List;
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
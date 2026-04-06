package enset.ma.test;

import enset.ma.model.*;
import enset.ma.observer.Configuration;
import enset.ma.strategy.StrategyA;

public class TestApp {
    public static void main(String[] args) {

        // Create configuration
        Configuration config = new Configuration();

        // Create shapes
        Circle c1 = new Circle(
                new Point(1, 2),
                5,
                1,
                "Black",
                "Red"
        );

        Rectangle r1 = new Rectangle(
                new Point(0, 0),
                4,
                6,
                1,
                "Blue",
                "Green"
        );

        // Create group
        Group group = new Group(1,"Black","White");

        group.addFigure(c1);
        group.addFigure(r1);

        // Create drawing
        Drawing drawing = new Drawing();

        drawing.addFigure(group);

        // Strategy
        drawing.setStrategy(new StrategyA());

        drawing.process();

        // Test configuration
        config.addObserver(c1);
        config.addObserver(r1);

        config.setThickness(3);

        drawing.display();

        System.out.println("TEST FINISHED");
    }
}

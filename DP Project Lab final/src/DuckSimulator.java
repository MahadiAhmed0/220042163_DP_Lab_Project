import Abstract.CountingDuckFactory;
import Adapter.Goose;
import Adapter.GooseAdapter;
import BasicStructure.Quackable;
import Composite.Flock;
import Decorator.QuackCounter;
import Observer.Quackologist;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        CountingDuckFactory factory = new CountingDuckFactory();
        simulator.simulate(factory);
    }

    void simulate(CountingDuckFactory factory) {
        // Create ducks via factory (each wrapped in QuackCounter)
        Quackable mallardDuck  = factory.createMallardDuck();
        Quackable redheadDuck  = factory.createRedheadDuck();
        Quackable rubberDuck   = factory.createRubberDuck();
        Quackable gooseDuck    = new GooseAdapter(new Goose());

        // Build flock
        Flock flock = new Flock();
        flock.add(mallardDuck);
        flock.add(redheadDuck);
        flock.add(rubberDuck);
        flock.add(gooseDuck);

        // Register observer
        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);

        // Quack!
        System.out.println("\n--- Flock Quacking ---");
        flock.quack();

        // Total quack count (excludes Goose as it's not wrapped in QuackCounter)
        System.out.println("\nTotal quacks: " + QuackCounter.getQuacks());
    }
}


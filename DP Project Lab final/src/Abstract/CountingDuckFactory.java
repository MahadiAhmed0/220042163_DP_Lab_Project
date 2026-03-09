package Abstract;

import BasicStructure.MallardDuck;
import BasicStructure.Quackable;
import BasicStructure.RedheadDuck;
import BasicStructure.RubberDuck;
import Decorator.QuackCounter;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}


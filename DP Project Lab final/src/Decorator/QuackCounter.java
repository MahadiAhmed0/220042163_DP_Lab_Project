package Decorator;

import BasicStructure.Observer;
import BasicStructure.Quackable;

public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int quackCount = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        quackCount++;
    }

    public static int getQuacks() {
        return quackCount;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        duck.removeObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }

    @Override
    public String toString() {
        return duck.toString();
    }
}



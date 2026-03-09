package BasicStructure;

public class RubberDuck implements Quackable {
    private Observable observable = new Observable(this);

    @Override
    public void quack() {
        System.out.println("Squeak!");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observable.removeObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Rubber Duck";
    }
}


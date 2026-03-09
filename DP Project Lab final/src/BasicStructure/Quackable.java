package BasicStructure;

public interface Quackable {
    void quack();
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}


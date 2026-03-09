package Observer;

import BasicStructure.Observer;
import BasicStructure.Quackable;

public class Quackologist implements Observer {

    @Override
    public void update(Quackable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}



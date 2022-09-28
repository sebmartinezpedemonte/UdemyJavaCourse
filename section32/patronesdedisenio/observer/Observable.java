package section32.patronesdedisenio.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        notifyObservers(null);
    }
    public void notifyObservers(Object obj){
        for(Observer obs : this.observers){
            obs.update(this, obj);
        }
    }
}

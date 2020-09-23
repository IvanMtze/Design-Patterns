package BehavioralPatterns.Observer;

import java.util.List;

public class Subject {
    public void attach(Observer o){
        _observers.add(o);
    }
    public void detach(Observer o){
        _observers.remove(o);
    }
    public void notifyS(){
        for(Observer i: _observers){
            i.update(this);
        }
    }
    private List<Observer> _observers;

}

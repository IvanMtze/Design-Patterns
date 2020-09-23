package BehavioralPatterns.Observer;



public class DigitalClock extends Observer{
    private ClockTimer _sub;

    public DigitalClock(ClockTimer _sub) {
        this._sub = _sub;
        _sub.attach(this);
    }


    @Override
    public void update(Subject theChangedSubject) {
        if(theChangedSubject == _sub)
            draw();
    }

    public void draw(){
        //do something
    }
}

package BehavioralPatterns.Mediator;


import java.awt.event.MouseEvent;

public class Widget {
    private DialogDirector _director;
    public Widget(DialogDirector dialogDirector){
        this._director = dialogDirector;
    }
    public void changed(){
        _director.widgetChanged(this);
    }
    public void handleMouse(MouseEvent evt){}
}

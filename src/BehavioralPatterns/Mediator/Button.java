package BehavioralPatterns.Mediator;

import java.awt.event.MouseEvent;

public class Button extends Widget{
    public Button(DialogDirector dialogDirector) {
        super(dialogDirector);
    }
    public void setText(String str){}
    public void handleMouse(MouseEvent evt){
        changed();
    }

}

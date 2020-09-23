package BehavioralPatterns.Mediator;

import java.awt.event.MouseEvent;

public class EntryField extends Widget{
    public EntryField(DialogDirector dialogDirector) {
        super(dialogDirector);
    }
    public void setText(String str){}
    public void getText(String str){}
    public void handleMouse(MouseEvent evt){}
}

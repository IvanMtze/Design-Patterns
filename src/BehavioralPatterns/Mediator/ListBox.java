package BehavioralPatterns.Mediator;

import java.util.List;

public class ListBox extends Widget{
    public ListBox(DialogDirector dialogDirector) {
        super(dialogDirector);
    }
    public String getSelection(){
        return "";
        //empty for simplicity
    }
    public void setList(List<String> str){}


}

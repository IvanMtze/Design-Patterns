package BehavioralPatterns.TemplateMethod;

public class View {
    public void display(){
        setFocus();
        doDisplay();
        resetFocus();
    }
    public void setFocus(){}
    public void doDisplay(){}
    public void resetFocus(){}
}

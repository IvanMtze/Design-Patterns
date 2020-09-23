package BehavioralPatterns.ChainOfResponsability;

public class Widget extends HelpHandler{
    private Widget parent;
    public Widget(HelpHandler _successor, int topic) {
        super(_successor, topic);
    }
}

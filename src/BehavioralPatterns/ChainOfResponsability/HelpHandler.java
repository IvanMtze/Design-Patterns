package BehavioralPatterns.ChainOfResponsability;

public class HelpHandler {
    protected static final int NO_HELP_TOPIC = -1;
    protected HelpHandler _successor;
    int topic;

    public HelpHandler(HelpHandler _successor, int topic) {
        this._successor = _successor;
        this.topic = topic;
    }
    public boolean hasHelp(){
        return this.topic != NO_HELP_TOPIC;
    }
    public void setHandler(HelpHandler hp, int topic){

    }
    public void handleHelp(){
        if(_successor != null){
            _successor.handleHelp();
        }
    }
    public void handleHelp(HelpHandler hh, int topic){
        _successor = new HelpHandler(hh,topic);
    }
}

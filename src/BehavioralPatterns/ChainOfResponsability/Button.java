package BehavioralPatterns.ChainOfResponsability;

public class Button extends Widget{
    public Button(HelpHandler _successor, int topic) {
        super(_successor, topic);
    }

    @Override
    public void handleHelp() {
        if(hasHelp()){

        }else{
            super._successor.handleHelp();
        }
    }
}

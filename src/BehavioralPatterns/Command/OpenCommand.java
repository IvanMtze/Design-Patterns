package BehavioralPatterns.Command;



public class OpenCommand extends Command{
    Application application;
    @Override
    public void execute() {
        char op = askUser();
        if(op != '0' ){
            Document doc = new Document();
            application.add(doc);
            doc.open();
        }
    }

    public OpenCommand(Application aplication){
        this.application = aplication;
    }

    public final char askUser(){
        //something
        return "a".toCharArray()[1];
    }

}

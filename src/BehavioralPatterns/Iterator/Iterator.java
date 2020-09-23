package BehavioralPatterns.Iterator;

public class Iterator<Item> {
    public void first(){}
    public void next(){}
    public boolean isDone(){
        return false;
    }
    public Item currentItem(){return null;}
    protected Iterator(){}
}

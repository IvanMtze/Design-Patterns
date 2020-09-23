package BehavioralPatterns.Iterator;

public abstract class ListTraverser <Item>{
    public ListTraverser(List<Item> aList){
        iterator = new ListIterator<>(aList);
    }
    public boolean traverse(){
        boolean result = false;
        for(iterator.first();!iterator.isDone();iterator.next()){
            result = processItem(iterator.currentItem());
            if(!result)
                break;
        }
        return result;
    }
    protected  abstract boolean processItem(Item i);
    private ListIterator<Item> iterator;
}
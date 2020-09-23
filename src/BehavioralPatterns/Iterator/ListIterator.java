package BehavioralPatterns.Iterator;

public class ListIterator<Item> extends Iterator<Item> {
     private List<Item> _list;
     private Integer current;

    @Override
    public void first() {
        current = 0;
    }

    @Override
    public void next() {
        current++;
    }

    @Override
    public boolean isDone() {
        return current >= _list.count();
    }

    @Override
    public Item currentItem() {
        if(isDone())
            throw new ArrayIndexOutOfBoundsException();
        return _list.get(current);
    }

    protected ListIterator(List alist) {
        _list = alist;
    }
}

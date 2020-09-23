package BehavioralPatterns.Iterator;

public class PrintNEmployees<Item> extends ListTraverser<Item>{
    private int _total = 0;
    private int _count = 0;

    public PrintNEmployees(List<Item> aList, int _total, int _count) {
        this(aList);
        this._total = _total;
        this._count = _count;
    }

    private PrintNEmployees(List<Item> aList) {
        super(aList);
    }

    @Override
    protected boolean processItem(Item i) {
        _count++;
        System.out.println(i.toString());
        return _count < _total;
    }

}

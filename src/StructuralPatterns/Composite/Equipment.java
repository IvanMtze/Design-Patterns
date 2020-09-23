package StructuralPatterns.Composite;

import java.util.Iterator;

public abstract class Equipment {
    private String name;
    protected Equipment e;
    public String getName() {
        return name;
    }
    public abstract Double power();
    public abstract Double NetPrice();
    public abstract Double discountPrice();
    public abstract void add(Equipment e);
    public abstract void remove(Equipment e);
    public abstract Iterator<Equipment> createIterator();

}

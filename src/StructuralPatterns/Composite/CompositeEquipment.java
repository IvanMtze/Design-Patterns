package StructuralPatterns.Composite;

import java.util.Iterator;
import java.util.List;

public class CompositeEquipment extends Equipment{
    List<Equipment> equipment;
    @Override
    public Double power() {
        return null;
    }

    @Override
    public Double NetPrice() {
        Double total = 0.0;
        Iterator<Equipment> i = createIterator();
        while(i.hasNext()){
            total += i.next().NetPrice();
        }
        return total;
    }

    @Override
    public Double discountPrice() {
        return null;
    }

    @Override
    public void add(Equipment e) {
        equipment.add(e);
    }

    @Override
    public void remove(Equipment e) {
        equipment.remove(e);
    }

    @Override
    public Iterator<Equipment> createIterator() {
        return equipment.iterator();
    }
}

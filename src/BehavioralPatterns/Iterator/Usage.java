package BehavioralPatterns.Iterator;

public class Usage {
    public void printEmployees(Iterator<Employee> emp){
        for(emp.first(); !emp.isDone(); emp.next()){
            //Do sometthing with
            emp.currentItem();
        }
    }


}

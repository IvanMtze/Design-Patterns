package StructuralPatterns.Adapter;

public class Shape {
    public  void BoundingBox(){

    }
    public Manipulator createManipulator(){
        return new Manipulator();
    }

}

package StructuralPatterns.Adapter;


import javax.xml.soap.Text;
import java.awt.*;

public class TextShape extends Shape{
    private TextView tw;
    public TextShape(TextView tw){
        this.tw = tw;
    }
    public void boundingBox(Point bottomLeft, Point topRight){
        Coord bottom = new Coord();
        Coord left, width, height;
        bottomLeft = new Point();
        bottomLeft.setLocation(bottom.getX(),bottom.getY());
    }

    public boolean isEmpty(){
        return tw.isEmpty();
    }
}

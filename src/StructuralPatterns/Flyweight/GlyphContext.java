package StructuralPatterns.Flyweight;

import java.awt.*;

public class GlyphContext {
    Font f;

    int index;

    public void next(int step){
    //empty for simplicity
    }
    public void insert(int quantity){
        //empty for simplicity
    }

    public Font getFont(){
        return f;
    }
    public void setFont(Font f){
        this.f = f;
    }
}

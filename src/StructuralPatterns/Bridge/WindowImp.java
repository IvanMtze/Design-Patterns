package StructuralPatterns.Bridge;

import StructuralPatterns.Adapter.Coord;

import java.awt.*;

public abstract class WindowImp {
    protected WindowImp(){}

    public abstract void impTop();
    public abstract void ImpBottom();
    public abstract void impSetExtent(Point p);
    public abstract void impSetOrigin(Point p);
    public abstract void deviceRect(Coord c , Coord c2);
    public abstract void deviceText(Coord c, Coord c2);
    public abstract void deviceBitmap(String s, Coord c);
    //

}

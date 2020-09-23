package StructuralPatterns.Bridge;

import StructuralPatterns.Adapter.Coord;

import java.awt.*;

public class PMWindowImp extends WindowImp{
    //im letting the interface as empty for simplicity but here goes the implementation
    @Override
    public void impTop() {

    }

    @Override
    public void ImpBottom() {

    }

    @Override
    public void impSetExtent(Point p) {

    }

    @Override
    public void impSetOrigin(Point p) {

    }

    @Override
    public void deviceRect(Coord c, Coord c2) {
        //draw rect here
    }

    @Override
    public void deviceText(Coord c, Coord c2) {
        //draw text here
    }

    @Override
    public void deviceBitmap(String s, Coord c) {

    }
}

package BehavioralPatterns.Strategy;

import StructuralPatterns.Adapter.Coord;

import java.awt.*;

public class Composition {
    Compositor _compositor;
    Component _components;
    int _componentCount;
    int _lineWidth;
    int _lineBreaks;
    int _lineCount;

    public Composition() {
    }

    public Composition(Compositor _compositor) {
        this._compositor = _compositor;
    }

    public void repair(){
        //null for simplicity
        Coord[] natural = null;
        Coord[] stretchability =  null;
        Coord[] shrinkability = null;
        int componentCount = 0;
        int[] breaks = null;

        int breakCount;
        breakCount = _compositor.Compose(natural,stretchability,shrinkability,componentCount,_lineWidth,breaks);
    }
}

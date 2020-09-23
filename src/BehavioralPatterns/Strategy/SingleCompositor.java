package BehavioralPatterns.Strategy;

import StructuralPatterns.Adapter.Coord;

public class SingleCompositor extends Compositor{
    @Override
    public int Compose(Coord[] natural, Coord[] strech, Coord[] shrink, int componentCount, int lineWidth, int[] breaks) {
        //do something and return result
        return 0;
    }
}

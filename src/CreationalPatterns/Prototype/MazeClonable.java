package CreationalPatterns.Prototype;

import CreationalPatterns.Intro.Maze;

public class MazeClonable extends Maze {
    public MazeClonable clone(){
        MazeClonable m = new MazeClonable();
        m.addRoom(super.roomNo(1));
        return m;
    }
}

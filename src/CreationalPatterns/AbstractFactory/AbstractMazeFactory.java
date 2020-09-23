package CreationalPatterns.AbstractFactory;

import CreationalPatterns.Intro.Door;
import CreationalPatterns.Intro.Maze;
import CreationalPatterns.Intro.Room;
import CreationalPatterns.Intro.Wall;

/**
 * I add this class for ilustrative porpouse only. It can be omited becouse we can take the MazeFactory concrete class as the abstract one.
 * I added this class although the book says that it can be ommited, and the book didn't add this class.
 */
public abstract class AbstractMazeFactory {
    public abstract Maze makeMaze();

    public abstract Wall makeWall();

    public abstract Room makeRoom(int n);

    public abstract Door makeDoor(Room r1, Room r2);
}

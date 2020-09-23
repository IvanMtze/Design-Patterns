package CreationalPatterns.FactoryMethod;

import CreationalPatterns.Intro.Direction;
import CreationalPatterns.Intro.Door;
import CreationalPatterns.Intro.Maze;
import CreationalPatterns.Intro.Room;

public class ConcreateCreateMaze extends MazeGame{

    @Override
    public Maze CreateMaze() {
        Maze aMaze = makeMaze();
        Room r1 = makeRoom(1);
        Room r2 = makeRoom(2);
        Door theDoor = makeDoor(r1,r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.North, makeWall());
        r1.setSide(Direction.East, theDoor);
        r1.setSide(Direction.South, makeWall());
        r1.setSide(Direction.West, makeWall());

        r1.setSide(Direction.North, makeWall());
        r1.setSide(Direction.East, makeWall());
        r1.setSide(Direction.South, makeWall());
        r1.setSide(Direction.West, theDoor);

        return aMaze;
    }
}

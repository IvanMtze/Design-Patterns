package CreationalPatterns.AbstractFactory;

import CreationalPatterns.Intro.*;

public class CreateMaze {
    //This class remedies the hard-code of the Intro.CreateMaze createMaze method.
    //Takes a mazeFactory as parameter.
    public Maze createMaze(MazeFactory factory){
        Maze aMaze= factory.makeMaze();
        Room r1 = factory.makeRoom(1);
        Room r2 = factory.makeRoom(2);
        Door theDoor = factory.makeDoor(r1,r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.North,factory.makeWall());
        r1.setSide(Direction.East,theDoor);
        r1.setSide(Direction.South,factory.makeWall());
        r1.setSide(Direction.West,factory.makeWall());

        r1.setSide(Direction.North,factory.makeWall());
        r1.setSide(Direction.East,factory.makeWall());
        r1.setSide(Direction.South,factory.makeWall());
        r1.setSide(Direction.West,theDoor);

        return aMaze;
    }

    //At this point, we can continue adding features to the Maze, fpr example, we can add a boom in a the maze. For
    //that task, we should add a new class (BoombedMazeFactory<-MazeFactory), and add new subclasses of the simple objects
    //like door, mapsite, room, etc etc.
}

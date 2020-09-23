package CreationalPatterns.Prototype;

import CreationalPatterns.AbstractFactory.MazeFactory;
import CreationalPatterns.Intro.Door;
import CreationalPatterns.Intro.Maze;
import CreationalPatterns.Intro.Room;
import CreationalPatterns.Intro.Wall;

public class MazePrototypeFactory extends MazeFactory {
    private Maze _maze;
    private Wall _wall;
    private Room _room;
    private Door _door;

    public MazePrototypeFactory(MazeClonable maze, Wall wall, Room room, Door door){
        _maze = maze.clone();
    //add other operations
        /**The mazeClonable is just an class that implements the clone operation. Doing it by this way, is incorrect.
         *I do this by this way just for example, but the correct way is write the clone inside the implementation of
         * maze class.
        **/
    }
}

package CreationalPatterns.AbstractFactory;

import CreationalPatterns.Intro.Door;
import CreationalPatterns.Intro.Maze;
import CreationalPatterns.Intro.Room;
import CreationalPatterns.Intro.Wall;

public class MazeFactory extends AbstractMazeFactory {
    @Override
    public Maze makeMaze() {return new Maze();}
    @Override
    public Wall makeWall(){
        return new Wall();
    }
    @Override
    public Room makeRoom(int n){
        return new Room(n);
    }
    @Override
    public Door makeDoor(Room r1, Room r2){
        return new Door(r1,r2);
    }
}

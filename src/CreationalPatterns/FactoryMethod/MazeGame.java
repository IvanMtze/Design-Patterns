package CreationalPatterns.FactoryMethod;

import CreationalPatterns.Intro.*;

public abstract class MazeGame {
    public abstract  Maze CreateMaze();
    public Maze makeMaze(){
        return new Maze();
    }
    public Room makeRoom(int n){
        return new Room(n);
    }

    public Wall makeWall(){
        return new Wall();
    }

    public Door makeDoor(Room r1, Room r2){
        return new Door(r1,r2);
    }
}

package CreationalPatterns.Builder;

import CreationalPatterns.Intro.*;

public abstract class MazeBuilder {
    public abstract void BuildMaze();
    public abstract void BuildRoom(int room);
    public abstract void BuildDoor(int roomFrom, int roomTo);
    public abstract Maze getMaze();
    protected MazeBuilder(){}
}

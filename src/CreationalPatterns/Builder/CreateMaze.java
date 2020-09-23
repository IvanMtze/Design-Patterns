package CreationalPatterns.Builder;

import CreationalPatterns.Intro.*;

public class CreateMaze {
    public Maze createMaze(MazeBuilder builder){
        builder.BuildMaze();
        builder.BuildRoom(1);
        builder.BuildRoom(2);
        builder.BuildDoor(1,2);
        return builder.getMaze();
    }

    public Maze createComplexMaze(MazeBuilder builder){
        builder.BuildRoom(1);
        builder.BuildRoom(1001);
        return builder.getMaze();
    }
}

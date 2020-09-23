package CreationalPatterns.Singleton;

import CreationalPatterns.Intro.Maze;
import CreationalPatterns.Prototype.MazePrototypeFactory;

public class MazeFactorySub extends MazeFactory{
    public static MazeFactory getInstance(String MAZESTYLE) {
        if(instance == null){
            if(MAZESTYLE.equals("NORMAL"))
                instance = new MazeFactory();
        }
        return instance;
    }
}

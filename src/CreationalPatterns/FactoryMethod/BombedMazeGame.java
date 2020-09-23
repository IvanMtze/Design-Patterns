package CreationalPatterns.FactoryMethod;

import CreationalPatterns.Intro.Wall;

public class BombedMazeGame extends  ConcreateCreateMaze{
    public Wall makeWall(){
        //here we can change the wall for a subclass of it. E.G. BombedWall.
        return new Wall();
    }
}

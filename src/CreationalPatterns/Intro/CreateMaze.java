package CreationalPatterns.Intro;

public class CreateMaze {
    public Maze createMaze(){
        Maze aMaze= new Maze();
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Door theDoor = new Door(r1,r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.North,new Wall());
        r1.setSide(Direction.East,theDoor);
        r1.setSide(Direction.South,new Wall());
        r1.setSide(Direction.West,new Wall());

        r1.setSide(Direction.North,new Wall());
        r1.setSide(Direction.East,new Wall());
        r1.setSide(Direction.South,new Wall());
        r1.setSide(Direction.West,theDoor);

        return aMaze;
    }
}

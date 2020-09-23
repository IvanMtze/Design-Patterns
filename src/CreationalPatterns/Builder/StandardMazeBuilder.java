package CreationalPatterns.Builder;

import CreationalPatterns.Intro.*;

public abstract class StandardMazeBuilder extends MazeBuilder{
    private Maze _currenteMaze;
    public StandardMazeBuilder(){
        _currenteMaze = null;
    }

    @Override
    public void BuildMaze() {
        _currenteMaze = new Maze();
    }

    @Override
    public void BuildRoom(int room) {
        if(_currenteMaze.roomNo(room)==null){
            Room _room = new Room(room);
            _currenteMaze.addRoom(_room);
            _room.setSide(Direction.North, new Wall());
            _room.setSide(Direction.South, new Wall());
            _room.setSide(Direction.East, new Wall());
            _room.setSide(Direction.West, new Wall());
        }
    }

    @Override
    public void BuildDoor(int roomFrom, int roomTo) {
        Room r1 = _currenteMaze.roomNo(roomFrom);
        Room r2 = _currenteMaze.roomNo(roomTo);
        Door d = new Door(r1,r2);

        r1.setSide(CommonWall(r1,r2),d);
        r2.setSide(CommonWall(r2,r1),d);
    }

    @Override
    public Maze getMaze() {
        return _currenteMaze;
    }

    private Direction CommonWall(Room r1, Room r2){
        return null;
    }
}

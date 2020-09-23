package CreationalPatterns.Intro;

public class Door extends MapSite {
    private Room _room1, _room2;
    private boolean isOpen;
    public Door(Room _room1, Room _room2){
        this._room1 = _room1;
        this._room2 = _room2;
    }

    public Room otherSideFrom(Room room){
        return null;
    }
    @Override
    public void enter() {}
}

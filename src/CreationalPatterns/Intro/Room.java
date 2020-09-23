package CreationalPatterns.Intro;

/**
 *Room is a concrete subclass of mapside. It mainteins references to other mapside objects and
 * stores a room number.
 */
public class Room extends MapSite{

    private int roomNo;
    MapSite[] map = new MapSite[4];
    public Room(int roomNo){
        this.roomNo = roomNo;
    }

    public MapSite getSide(Direction d){
        return null;
    }

    public void setSide(Direction d, MapSite map){
    }

    @Override
    public void enter() {
    }

}

package CreationalPatterns.Singleton;


public class MazeFactory {
    protected static MazeFactory instance = null;
    //existing interface goes here
    protected MazeFactory(){}
    private static MazeFactory getInstance(){
        if(instance == null){
            instance = new MazeFactory();
        }
        return instance;
    }
}

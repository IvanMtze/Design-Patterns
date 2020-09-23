package BehavioralPatterns.Memento;

public class ConstraintSolver {
    static ConstraintSolver instance;
    public void solve(){}
    public void addConstraint(Graphic startConnection, Graphic endConnection){}
    public void removeConstraint(Graphic startConnection, Graphic endConnection){}
    public ConstraintSolverMemento createMemento(){return null;}
    public void setMemento(ConstraintSolverMemento memento){}

}

package BehavioralPatterns.Memento;

import java.awt.*;

public class MoveCommand{
    public MoveCommand(Graphic target, Point delta){

    }
    public void execute(){
        ConstraintSolver solver = ConstraintSolver.instance;
        _state = solver.createMemento();
        //do something like this _target.move(_delta);
        solver.solve();
    }
    public void unexecute(){
        ConstraintSolver solver = ConstraintSolver.instance;
        //_target.move(_delta);
        solver.setMemento(_state);
        solver.solve();
    }

    private ConstraintSolverMemento _state;
    private Point _delta;
    private Graphic _target;
}

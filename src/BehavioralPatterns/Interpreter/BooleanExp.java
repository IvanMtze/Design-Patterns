package BehavioralPatterns.Interpreter;

public abstract class BooleanExp {
    public abstract boolean evaluate(Context c);
    public abstract BooleanExp replace(String str, BooleanExp be);
    public abstract BooleanExp copy();
}

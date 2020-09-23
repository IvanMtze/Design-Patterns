package BehavioralPatterns.Interpreter;

public abstract class Context {
    public abstract boolean lookup(String name);
    public abstract void Assign(VariableExp var, boolean bool);
}

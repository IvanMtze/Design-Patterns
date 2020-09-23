package BehavioralPatterns.Interpreter;

public class VariableExp extends BooleanExp{
    protected String _name;

    public VariableExp() {
    }

    public VariableExp(String name) {
        this._name = name;
    }

    @Override
    public boolean evaluate(Context c) {
        return c.lookup(_name);
    }

    @Override
    public BooleanExp replace(String str, BooleanExp be) {
        if(_name.equals(str)){
            return be.copy();
        }
        return new VariableExp(_name);
    }

    @Override
    public BooleanExp copy() {
        return new VariableExp(_name);
    }
}

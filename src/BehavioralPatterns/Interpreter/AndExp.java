package BehavioralPatterns.Interpreter;

public class AndExp extends  BooleanExp{
    private BooleanExp _operand1;
    private BooleanExp _operand2;

    public AndExp(BooleanExp _operand1, BooleanExp _operand2) {
        this._operand1 = _operand1;
        this._operand2 = _operand2;
    }

    public AndExp() {
    }


    @Override
    public boolean evaluate(Context c) {
        return _operand1.evaluate(c) && _operand2.evaluate(c);
    }

    @Override
    public BooleanExp replace(String str, BooleanExp be) {
        return new AndExp(_operand1.replace(str,be),_operand2.replace(str,be));
    }

    @Override
    public BooleanExp copy() {
        return new AndExp(_operand1.copy(),_operand2.copy());
    }
}

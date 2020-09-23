package StructuralPatterns.Facade;

public class ProgramNodeBuilder {
    private ProgramNode _node;

    public final ProgramNode newVariable(Character c) {
        //Return null for simplicity
        return null;
    }

    public final ProgramNode newAssignment(ProgramNode var, ProgramNode expression) {
        //Return null for simplicity
        return null;
    }

    public final ProgramNode newReturnStatement(ProgramNode value) {
        //Return null for simplicity
        return null;
    }

    public final ProgramNode newCondition(ProgramNode condition, ProgramNode truePart, ProgramNode falsePart) {
        //Return null for simplicity
        return null;
    }

    public final ProgramNode getRootNode() {
        return _node;
    }
}

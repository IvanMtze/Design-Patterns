package StructuralPatterns.Facade;

import java.util.ListIterator;

public class ExpressionNode {
    //Empty for simplicity
    public void traverse(CodeGenerator cg) {
        cg.visit(this);
        //Null for simplicity
        ListIterator<ProgramNode> i = null;
        //Nothing for simplicity
        while (i.hasNext()) {
            i.next();
        }
    }
}

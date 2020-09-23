package StructuralPatterns.Facade;

import jdk.nashorn.internal.parser.Token;

import java.io.DataInputStream;

public class Scanner {
    DataInputStream input;

    public Scanner(DataInputStream input) {
        this.input = input;
    }

    public Token scan() {
        //return nothing for simplicity
        return null;
    }

}

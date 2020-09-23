package StructuralPatterns.Flyweight;

import java.awt.*;

public class Character extends Glyph{
    char c;

    public Character(char c) {
        this.c = c;
    }

    @Override
    public void Draw(Window window, GlyphContext glyphContext) {
        super.Draw(window, glyphContext);
    }
}

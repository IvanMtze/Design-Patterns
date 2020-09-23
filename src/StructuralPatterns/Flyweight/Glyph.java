package StructuralPatterns.Flyweight;

import java.awt.*;

public class Glyph {
    Font font;
    public void Draw(Window window, GlyphContext glyphContext){}
    public void setFont(Font font, GlyphContext glyphContext){}
    public Font getFont(GlyphContext glyphContext){
        return font;
    }

    public void first(GlyphContext glyphContext){}
    public void next(GlyphContext glyphContext){}
    public boolean isDone(GlyphContext glyphContext){
        //empty for simplicity
        return false;
    }
    public Glyph current(GlyphContext glyphContext){
        //empty for simplicity
        return null;
    }

    public void remove(Glyph g,GlyphContext glyphContext){}
    public void insert(GlyphContext glyphContext){}
}

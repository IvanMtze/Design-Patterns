package StructuralPatterns.Bridge;

import javax.swing.text.View;
import java.awt.*;

public abstract class Window {
    View contents;
    WindowImp imp;
    public Window(View contents){}

    public abstract void drawContents();
    public abstract void open();
    public abstract void close();
    public abstract void iconify();
    public abstract void Deiconify();

    public abstract void setOrigin(Point origin);
    public abstract void setExtend(Point extend);
    public abstract void raise();
    public abstract void lower();

    public abstract void drawLine(Point p, Point p2);
    public abstract void drawRect(Point p, Point p2);
    public abstract void drawPolygon(Point[] p, int n);
    public abstract void drawText(String txt, Point p);

    public abstract WindowImp getWindowImp();
    public abstract View getView();
}

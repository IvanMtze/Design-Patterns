package StructuralPatterns.Bridge;

import javax.swing.text.View;
import java.awt.*;

public class ApplicationWindow extends Window{

    public ApplicationWindow(View contents) {
        super(contents);
        //Do something
        getView();
    }

    @Override
    public void drawContents() {
        //Do something
        getView();
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void iconify() {

    }

    @Override
    public void Deiconify() {

    }

    @Override
    public void setOrigin(Point origin) {

    }

    @Override
    public void setExtend(Point extend) {

    }

    @Override
    public void raise() {

    }

    @Override
    public void lower() {

    }

    @Override
    public void drawLine(Point p, Point p2) {

    }

    @Override
    public void drawRect(Point p, Point p2) {

    }

    @Override
    public void drawPolygon(Point[] p, int n) {

    }

    @Override
    public void drawText(String txt, Point p) {

    }

    @Override
    public WindowImp getWindowImp() {
        return imp;
    }

    @Override
    public View getView() {
        return contents;
    }
}

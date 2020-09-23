package StructuralPatterns.Proxy;

import java.awt.*;
import java.io.File;

public class ImageProxy extends Image{
    Point p;
    String fileName;
    Image image;
    private ImageProxy(File file, String fileName) {
        super(file.getAbsolutePath());
        this.fileName = fileName;
    }
    public ImageProxy(String fileName) {
        this(null,fileName);
    }

    public Image getImage(){
        if(image == null)
            image = new Image(fileName);
        return image;
    }

    @Override
    public Point getExtent() {
        if(p == null){
            p = getImage().getExtent();
        }
        return p;
    }

    @Override
    public void Draw(Point p) {
        getImage().Draw(p);
    }

    @Override
    public void handleMouse(Event evt) {
        getImage().handleMouse(evt);
    }
}

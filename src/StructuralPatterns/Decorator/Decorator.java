package StructuralPatterns.Decorator;

public class Decorator extends VisualComponent{
    @Override
    public void draw() {
        component.draw();
    }

    @Override
    public void resize() {
        component.resize();
    }

    private VisualComponent component;
}

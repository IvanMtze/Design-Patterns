package StructuralPatterns.Decorator;

public class BorderDecorator extends Decorator{
    private int size;
    private VisualComponent v;
    public BorderDecorator(VisualComponent v, int n) {
        this.v = v;
        this.size = n;
    }
    @Override
    public void draw() {
        super.draw();
        drawBorder(size);
    }

    private void drawBorder(int n){
        //Do something with the border
    }
    @Override
    public void resize() {
        super.resize();

    }
}

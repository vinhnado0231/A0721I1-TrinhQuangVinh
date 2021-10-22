package ss7_abstract_class_va_interface.bai_tap.colorable;

import ss7_abstract_class_va_interface.bai_tap.resizeable.Resizeable;
import ss7_abstract_class_va_interface.bai_tap.resizeable.Shape;

public class Square extends Shape implements Colorable,Resizeable {
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public double getArea(){
        return Math.pow(getEdge(),2);
    }

    public double getVolume(){
        return Math.pow(getEdge(),3);
    }

    public String toString() {
        return "A Square with edge="
                + getEdge()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        this.edge += this.edge * percent / 100;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
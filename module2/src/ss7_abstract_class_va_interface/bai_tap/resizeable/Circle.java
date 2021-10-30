package ss7_abstract_class_va_interface.bai_tap.resizeable;

import ss7_abstract_class_va_interface.bai_tap.colorable.Colorable;

public class Circle extends Shape implements  Resizeable, Colorable {
    private double radius = 1.0;

    public Circle() {
        this.radius = Math.random() * 99;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius += this.radius * percent / 100;
    }

    @Override
    public void howToColor() {
        System.out.println("Color the circle");
    }
}

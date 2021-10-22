package ss7_abstract_class_va_interface.bai_tap.resizeable;

import ss7_abstract_class_va_interface.bai_tap.colorable.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1, "red", true);
        shapes[1] = new Rectangle(1, 3, "blue", false);
        shapes[2] = new Square(5.5);
        for (int i = 0; i < 3; i++) {
            System.out.println("Before resize: ");
            System.out.println(shapes[i].toString());
            double percent = Math.random() * 100;
            shapes[i].resize(percent);
            System.out.println("After resize: ");
            System.out.println(shapes[i].toString());
        }
    }
}

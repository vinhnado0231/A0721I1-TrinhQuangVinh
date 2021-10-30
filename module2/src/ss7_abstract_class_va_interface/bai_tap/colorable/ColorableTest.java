package ss7_abstract_class_va_interface.bai_tap.colorable;

import ss7_abstract_class_va_interface.bai_tap.resizeable.Circle;
import ss7_abstract_class_va_interface.bai_tap.resizeable.Rectangle;
import ss7_abstract_class_va_interface.bai_tap.resizeable.Shape;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1, "red", true);
        shapes[1] = new Rectangle(1, 3, "blue", false);
        shapes[2] = new Square(5.5);
        for (int i = 0; i < 3; i++) {
            shapes[i].howToColor();
        }
    }
}

package ss7_abstract_class_va_interface.bai_tap.colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Square[] square = new Square[2];
        square[0] = new Square();
        square[1] = new Square();

        square[0].setEdge(3);
        square[1].setEdge(5);

        System.out.println("Area square1: " + square[0].getArea());
        System.out.println("Area square2: " + square[1].getArea());

        System.out.println("Volume square1: " + square[0].getVolume());
        System.out.println("Volume square2: " + square[1].getVolume());
        square[0].howToColor();
        square[1].howToColor();
    }
}

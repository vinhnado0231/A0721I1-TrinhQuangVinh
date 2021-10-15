package ss5_access_modifier_static_method_static_property.bai_tap;

import java.util.Scanner;

public class AccessModifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Input radius: ");
        double radius = input.nextDouble();
        Circle circle1 =new Circle(radius);
        System.out.printf("Area of circle is %f",circle1.getArea());
    }
}

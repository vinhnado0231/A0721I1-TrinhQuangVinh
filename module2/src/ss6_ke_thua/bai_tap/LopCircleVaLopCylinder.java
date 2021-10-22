package ss6_ke_thua.bai_tap;

public class LopCircleVaLopCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder(4,5);
        System.out.println(cylinder.getVolume());
    }
}

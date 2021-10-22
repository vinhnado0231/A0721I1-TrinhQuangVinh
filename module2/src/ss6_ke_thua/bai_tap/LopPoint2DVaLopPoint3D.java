package ss6_ke_thua.bai_tap;

public class LopPoint2DVaLopPoint3D {
    public static void main(String[] args) {
        Point2D point1 =new Point2D();
        point1.setXY(3,5);
        System.out.println(point1.toString());
        Point3D point2 =new Point3D();
        point2.setXYZ(3,5,7);
        System.out.println(point2.toString());
        point2.setXYZ(10,20,30);
        System.out.println(point2.toString());
        System.out.println(point2.getXYZ()[0]);
        System.out.println(point2.getXYZ()[1]);
        System.out.println(point2.getXYZ()[2]);

    }
}

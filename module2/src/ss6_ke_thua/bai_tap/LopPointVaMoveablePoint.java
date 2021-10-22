package ss6_ke_thua.bai_tap;

public class LopPointVaMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint point1=new MoveablePoint();
        point1.setSpeed(1,1);
        System.out.println(point1.toString() );
        point1.setXY(5,10);
        point1.move();
        System.out.println(point1.toString());
        MoveablePoint pointB =new MoveablePoint(3,3,4,5);
        pointB.move();
        System.out.println(pointB.toString());

    }
}

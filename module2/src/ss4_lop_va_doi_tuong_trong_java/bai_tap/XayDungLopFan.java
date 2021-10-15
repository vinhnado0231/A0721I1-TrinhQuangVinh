package ss4_lop_va_doi_tuong_trong_java.bai_tap;

public class XayDungLopFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(15);
        fan1.setColor("blue");
        fan1.setStatus(true);
        System.out.println("Fan 1: " + fan1.toString());

    }
}

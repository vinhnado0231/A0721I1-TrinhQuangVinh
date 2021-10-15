package ss5_access_modifier_static_method_static_property.bai_tap;

public class XayDungLopChiGhiTrongJava {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.printf("Name: %s  Class: %s", student1.getName(), student1.getClasses());
        student1.setName("Lucifer");
        student1.setClasses("A01");
        System.out.printf("\nName: %s  Class: %s", student1.getName(), student1.getClasses());
    }
}

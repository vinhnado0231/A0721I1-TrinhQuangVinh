package ss9_dsa_danh_sach.bai_tap;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "vinh01");
        Student student2 = new Student(2, "vinh02");
        Student student3 = new Student(3, "vinh03");
        Student student4 = new Student(4, "vinh04");
        Student student5 = new Student(5, "vinh05");
        Student student6 = new Student(6, "vinh06");
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addFirst(student3);
        myLinkedList.add(1, student4);
        myLinkedList.add(3, student5);

        System.out.println(myLinkedList.indexOf(student3));
        System.out.println(myLinkedList.indexOf(student1));
        System.out.println(myLinkedList.constrains(student5));
        System.out.println(myLinkedList.constrains(student6));
        myLinkedList.addLast(student6);
        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }
    }

}

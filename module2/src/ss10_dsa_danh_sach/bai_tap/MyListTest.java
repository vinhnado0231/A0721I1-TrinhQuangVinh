package ss10_dsa_danh_sach.bai_tap;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        System.out.println("Danh sach trong MyList: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Clear list");
        list.clear();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}

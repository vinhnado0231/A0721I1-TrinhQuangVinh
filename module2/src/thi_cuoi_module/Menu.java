package thi_cuoi_module;

import java.util.Scanner;

public class Menu {
    public static QLPhoneChinhHang phoneChinhHang = new QLPhoneChinhHang();
    public static QLPhoneXachTay phoneXachTay = new QLPhoneXachTay();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        PhoneChinhHang phone1 =new PhoneChinhHang("Samsung S9",1000000,10,"Samsung",365,false);
//        PhoneChinhHang phone2= new PhoneChinhHang("Iphone X",2000000,10,"Apple",365,true);
//        PhoneXachTay phone3= new PhoneXachTay("Nokia N72",1000000,10,"Nokia","China", false);
//        PhoneXachTay phone4= new PhoneXachTay("Iphone" 11,6000000,10,"Apple","USA", false);

        int choice;
        boolean loop = true;
        do {
            System.out.println("------------------MENU----------------");
            System.out.println("Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách điện thoại\n" +
                    "4. Tìm kiếm\n" +
                    "5. Thoát\n" +
                    "Chọn chức năng:\n");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    boolean check = true;
                    System.out.println("1. Thêm điện thoại chính hãng" +
                            "\n2. Thêm điện thoại xách tay" +
                            "\nChọn chức năng: ");
                    do {
                        check = true;
                        choice = scanner.nextInt();
                        if (choice == 1) {
                            phoneChinhHang.add();
                        } else if (choice == 2) {
                            phoneXachTay.add();
                        } else {
                            check = false;
                            System.out.println("Nhập sai mời bạn nhập lại");
                        }
                    } while (!check);
                    break;
                }
                case 2: {
                    boolean check = true;
                    System.out.println("1. Xoá điện thoại chính hãng" +
                            "\n2. Xoá điện thoại xách tay" +
                            "\nChọn chức năng: ");
                    do {
                        check = true;
                        choice = scanner.nextInt();
                        if (choice == 1) {
                            phoneChinhHang.delete();
                        } else if (choice == 2) {
                            phoneXachTay.delete();
                        } else {
                            check = false;
                            System.out.println("Nhập sai mời bạn nhập lại");
                        }
                    } while (!check);
                    break;
                }
                case 3: {
                    System.out.println("List danh sách điện thoại chính hãng :");
                    phoneChinhHang.display();
                    System.out.println("List danh sách điện thoại xách tay :");
                    phoneXachTay.display();
                    break;
                }
                case 4: {
                    boolean check = true;
                    System.out.println("Bạn muốn tìm kiếm điện thoại: " +
                            "\n1.Chính hãng" +
                            "\n2.Xách tay" +
                            "\n Nhập lựa chọn của bạn:");
                    do {
                        check = true;
                        int choose = scanner.nextInt();
                        if (choose == 1) {
                            System.out.println("Nhập id cần tìm:");
                            int id = scanner.nextInt();
                            if (phoneChinhHang.search(id)) {
                                System.out.println("Có trong list");
                            }
                        } else if (choose == 2) {
                            System.out.println("Nhập id cần tìm:");
                            int id = scanner.nextInt();
                            if (phoneXachTay.search(id)) {
                                System.out.println("Có trong list");
                            }
                        } else {
                            System.out.println("Nhập sai mời nhập lại");
                            check = false;
                        }
                    } while (!check);
                    break;
                }
                case 5:{
                    loop=false;
                    break;
                }
                default:{
                    System.out.println("Nhập sai mời bạn nhập lại");
                }
            }
        } while (loop);
    }
}

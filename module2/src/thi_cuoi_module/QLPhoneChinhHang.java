package thi_cuoi_module;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class QLPhoneChinhHang implements Manage {
    Scanner scanner = new Scanner(System.in);
    public static List<PhoneChinhHang> phoneCHinhHangList = new LinkedList<>();

    @Override
    public void add() {
        boolean check = true;
        double price;
        int amount;
        boolean status = true;
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.println("Nhập giá sản phẩm: ");
        do {
            check=true;
            price = scanner.nextDouble();
            if (price < 0) {
                System.out.println("Nhập sai mời bạn nhập lại");
                check = false;
            }
        } while (!check);

        System.out.println("Nhập số lượng sản phẩm: ");
        do {
            check=true;
            amount = scanner.nextInt();
            if (amount < 0) {
                System.out.println("Nhập sai mời bạn nhập lại");
                check = false;
            }
        } while (!check);
        String space =scanner.nextLine();
        System.out.println("Nhập hãng sản xuất:");
        String producer = scanner.nextLine();
        int waranty;
        System.out.println("Nhập thời gian bảo hành (không quá 730 ngày):");
        do {
            check=true;
            waranty = scanner.nextInt();
            if (waranty < 0 || waranty > 730) {
                check = false;
                System.out.println("Nhập sai mời bạn nhập lại");
            }
        } while (!check) ;

        System.out.println("Nhập: " +
                "\n 1. Bảo hành toàn thế giới" +
                "\n 2. Bảo hành toàn quốc");
        do {
            check=true;
            int choice = scanner.nextInt();
            if (choice == 1) {
                status = true;
            } else if (choice == 2) {
                status = false;
            } else {
                check = false;
                System.out.println("Nhập sai mời bạn nhập lại");
            }
        } while (!check);
        PhoneChinhHang phoneChinhHang = new PhoneChinhHang(name, price, amount, producer, waranty, status);
        phoneCHinhHangList.add(phoneChinhHang);
    }


    @Override
    public void delete() {
        int choice;
        boolean check = true;
        if (phoneCHinhHangList.isEmpty()) {
            System.out.println("Không có sản phẩm nào");
            return;

        } else {
            System.out.println("Nhập id cần xóa: ");
            int id = scanner.nextInt();
            System.out.println("Bạn có muốn xoá điện thoại với id này không? " +
                    "\n 1.Yes" +
                    "\n 2.No");
            choice = scanner.nextInt();
            do {
                check=true;
                if (choice == 1) {
                } else if (choice == 2) {
                    return;
                } else {
                    check = false;
                    System.out.println("Nhập sai mời bạn nhập lại");
                }
            } while (!check);
            if (search(id)) {
                phoneCHinhHangList.remove(id - 1);
                System.out.println("Đã xoá!");
            }
            System.out.println("Không tồn tại sản phẩm với id vừa nhập");
        }
    }

    @Override
    public boolean search(int id) {
        boolean check = false;
        if (phoneCHinhHangList.isEmpty()) {
            System.out.println("List trống!");
            return check;
        } else {
            for (PhoneChinhHang product : phoneCHinhHangList) {
                if (product.getId() == id) {
                    check = true;
                    break;
                }
            }
            return check;
        }
    }

    @Override
    public void display() {
        if (phoneCHinhHangList.isEmpty()) {
            System.out.println("Không có sản phẩm nào");
            return;

        } else {
            for (PhoneChinhHang phone : phoneCHinhHangList) {
                System.out.println(phone.toString());
            }
        }
    }

    @Override
    public int getAmount() {
        return phoneCHinhHangList.size();
    }
}


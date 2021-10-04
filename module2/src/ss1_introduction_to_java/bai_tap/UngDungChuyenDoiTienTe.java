package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền usd cần chuyển sang vnd: ");
        double usd = scanner.nextDouble();
        double vnd = usd * 23000.0D;
        System.out.println("Số tiền sau khi chuyển (vnd) " + vnd);
    }
}

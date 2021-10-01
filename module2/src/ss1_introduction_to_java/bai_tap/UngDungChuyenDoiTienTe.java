package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd, vnd;
        System.out.println("Nhập số tiền usd cần chuyển sang vnd: ");
        usd = scanner.nextDouble();
        vnd = usd * 23000;
        System.out.println("Số tiền sau khi chuyển (vnd) " + vnd);
    }
}

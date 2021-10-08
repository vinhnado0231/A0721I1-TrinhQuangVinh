package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập chuỗi: ");
        String str = input.nextLine();
        System.out.printf("\nNhập kí tự cần kiểm tra: ");
        char check = input.next().charAt(0);
        System.out.printf("Kí tự này xuất hiện %d lần trong chuỗi", countChar(str, check));
    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
        }
        return count;
    }
}

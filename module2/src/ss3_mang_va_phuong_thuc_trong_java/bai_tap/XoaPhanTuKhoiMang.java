package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Nhập phần tử cần xoá: ");
        double n = input.nextDouble();
        if (delete(indexDelete(n, A), A)) {
            for (double v : A) {
                System.out.print(v + "\t");
            }
        }
    }

    public static int indexDelete(double n, double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                return i;
            }
        }
        System.out.println("Mảng không chứa phần tử này!");
        return -1;
    }

    public static boolean delete(int k, double[] array) {
        if (k == -1) {
            return false;
        } else {
            if (array.length - 1 - k >= 0) System.arraycopy(array, k + 1, array, k, array.length - 1 - k);
            array[array.length - 1] = 0;
        }
        return true;
    }
}

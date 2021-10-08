package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] A = {0, 1, 2, 3, 4, 5, 0, 0, 0, 0};
        System.out.print("Nhập phần tử cần thêm: ");
        double n = input.nextDouble();
        System.out.print("Nhập vị trí cần thêm: ");
        int k = input.nextInt() ;
        if (addOne(n, k, A)) {
            for (double v : A) {
                System.out.print(v + "\t");
            }
        }
    }

    public static boolean addOne(double n, int k, double[] array) {
        if (k < 0 || k >= array.length) {
            System.out.println("Vị trí nhập không tồn tại");
            return false;
        } else {
            if (array.length - 1 - k >= 0) System.arraycopy(array, k, array, k + 1, array.length - 1 - k);
            array[k] = n;
        }
        return true;
    }
}

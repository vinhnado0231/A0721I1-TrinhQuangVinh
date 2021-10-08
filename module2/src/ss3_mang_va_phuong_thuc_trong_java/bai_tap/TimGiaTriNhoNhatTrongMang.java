package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int n = input.nextInt();
        int[] array = new int[n];
        inputArray(array, n);
        System.out.print("\nGiá trị nhỏ nhất là " + getMin(array));
    }

    static void inputArray(int[] arr, int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập A[%d]=  ", i);
            arr[i] = input.nextInt();
        }
    }

    static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }
}
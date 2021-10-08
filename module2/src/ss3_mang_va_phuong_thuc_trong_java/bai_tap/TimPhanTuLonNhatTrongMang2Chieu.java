package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int row = input.nextInt();
        System.out.print("Nhập số cột: ");
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        inputArray(arr, row, col);
        display(arr, row, col);
        System.out.println("Phần tử lớn nhất trong mảng là " + maxOfArray(arr, row, col));
    }

    static void inputArray(int[][] arr, int row, int col) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập A[%d,%d]=  ", i, j);
                arr[i][j] = input.nextInt();
            }
        }
    }

    static int maxOfArray(int[][] arr, int row, int col) {
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < arr[i][j]) max = arr[i][j];
            }
        }
        return max;
    }

    static void display(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

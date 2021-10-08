package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TongDuongCheoMaTranVuong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập ma trận vuông cấp n= ");
        int row = input.nextInt();
        int col = row;
        int[][] arr = new int[row][col];
        inputArray(arr, row, col);
        display(arr, row, col);
        System.out.printf("Tổng đường chéo của ma trận vuông = %d ", sum(arr,row));
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

    static int sum(int[][] arr, int row) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j=0; j<row;j++){
                if (i==j){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
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

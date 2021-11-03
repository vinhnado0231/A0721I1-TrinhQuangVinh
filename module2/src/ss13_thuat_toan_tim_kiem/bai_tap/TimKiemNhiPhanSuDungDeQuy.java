package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.Scanner;

public class TimKiemNhiPhanSuDungDeQuy {
    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int array[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = array.length;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập phần tử cần tìm trong mảng: ");
        int x = input.nextInt();
        int result = obj.binarySearch(array, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}

class BinarySearch {
    int binarySearch(int array[], int x, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (array[mid] == x)
                return mid;
            if (array[mid] > x)
                return binarySearch(array, x, low, mid - 1);
            return binarySearch(array, x, mid + 1, high);
        }

        return -1;
    }
}

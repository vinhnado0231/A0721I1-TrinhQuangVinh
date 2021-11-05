package ss14_thuat_toan_sap_xep.bai_tap;

public class CaiDatThuatToanSapXepChen {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 3, 7, 9, 0, -2};
        insertionSort(arr);
        System.out.print("Sorted array: \n");
        printArray(arr);
    }

    static void insertionSort(int[] arr) {
        int i, key, j;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.printf("%d ", arr[i]);
        System.out.print("\n");
    }
}

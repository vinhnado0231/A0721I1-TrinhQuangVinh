package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5};
        int[] arrayB = {6, 7, 8, 9, 10};
        int n = arrayA.length + arrayB.length;
        int[] arrayC = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < arrayA.length) {
                arrayC[i] = arrayA[i];
            }else{
                arrayC[i]=arrayB[i-arrayB.length];
            }
        }
        System.out.println(Arrays.toString(Arrays.stream(arrayA).toArray()));
        System.out.println(Arrays.toString(Arrays.stream(arrayB).toArray()));
        System.out.println(Arrays.toString(Arrays.stream(arrayC).toArray()));
    }
}


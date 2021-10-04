package ss2_vong_lap_trong_java.bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Prime numbers less than one hundred: ");
        while (num < 100) {
            if (isPrime(num)) {
                System.out.printf("%d ", num);
            }
            num++;
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

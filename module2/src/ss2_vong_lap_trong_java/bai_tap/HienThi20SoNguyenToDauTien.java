package ss2_vong_lap_trong_java.bai_tap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int num = 0, count = 0;
        System.out.println("First twenty primes: ");
        while(count<20){
            if(isPrime(num)){
                System.out.printf("%d ",num);
                count++;
            }
            num++;
        }
    }

    static boolean isPrime(int n) {
        if(n<2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

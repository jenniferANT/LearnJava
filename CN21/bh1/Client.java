package CN21.bh1;

public class Client {
    public static void main(String[] args) {
        int a ;
        int b ;
        //tongSNT(1,10);
        System.out.println("Tong= "+tongSNT(1,10));
    }

    private static int tongSNT(int a, int b){
        int sum = 0;
        for (int i  = a ; i <= b; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
        //System.out.println("Tổng các số nguyên tố từ " + a + " đến " + b + " là: " + sum);
    }
    private static boolean isPrime(int n) {
        if (n <= 1) {
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


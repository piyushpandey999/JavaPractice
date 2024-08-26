public class PrimeNumber {
    public static void main(String[] args) {
        if (isPrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
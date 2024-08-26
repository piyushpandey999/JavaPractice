import java.util.Scanner;

public class Factorial {

    public static int factorial(int n){

        if(n == 0)
            return 1;
        return n*factorial(n-1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scanner.nextInt();
        System.out.println("factorial of the number is :" + factorial(n));
    }
}

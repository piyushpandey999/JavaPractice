import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();
        fibonaci(num);
//        System.out.println(factorial(num));
//        if(prime(num)){
//            System.out.println("prime");
//        }
//        else{
//            System.out.println("not prime");
//        }
//        int rev =0,r  ;
//        while(num>0){
//            r = num%10;
//            rev = rev*10+r;
//            num = num/10;
//        }
//        System.out.println(rev);
//fibonacci(num);
//        String str = "Java,Selenium,TestNG,Maven";
//        String[] str2 = str.split(",");
//        for(String s : str2){
//          System.out.println(s);
//
String a ="abc",b ="def",c ="ghi";
//        System.out.println(a.concat(b.concat(c)));
        System.out.println(a.concat(b).concat(c));
}
public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
            return true;

    }
public static void fibonaci(int n){
    int n1=0 , n2=1 , count =0;
    while(count<n){
        System.out.println(n1 + " ");

        int n3 = n2+n1;
        n1=n2;
        n2=n3;
        count = count+1;
        }
}
}
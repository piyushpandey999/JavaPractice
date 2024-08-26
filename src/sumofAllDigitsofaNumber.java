public class sumofAllDigitsofaNumber{

    public static void main(String[] args) {
        sumofAllDigits(333);
    }
    public static void sumofAllDigits(int num){
        int cpoynum = num;
        int sum = 0;
        while(cpoynum > 0){
            int lastdiggit = cpoynum%10;
            sum = sum+ lastdiggit;
//            sum = sum+num%10;
            cpoynum = cpoynum/10;

        }
        System.out.println("sumofAllDigits of" + num + "is " + sum);
    }
}

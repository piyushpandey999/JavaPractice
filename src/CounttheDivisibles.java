public class CounttheDivisibles {

    public static void main(String[] args) {

        divisible(456);
    }

    // function that counts the number of digits that divides it is

    public static void divisible(int n){
        int temp = n;
        int count =0;
        while (temp>0){
            int rem = temp%10;
            if (rem!=0 && n%rem==0){
                count++;
            }
            temp = temp/10;
        }
        System.out.println("The number of digits in "+n+" that divide it is are - "+count);
    }
}

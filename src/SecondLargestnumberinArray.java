public class SecondLargestnumberinArray {

    public static void main(String[] args) {
        int[] array = {45, 30, 4, 76, 23};
//        System.out.println(secondLargestnumber(array));
        System.out.println(test(array));
    }

    public static int secondLargestnumber(int[] input) {
        int firstLargest, secondLargest;
        if (input[0] > input[1]) {
            firstLargest = input[0];
            secondLargest = input[1];
        } else {
            firstLargest = input[1];
            secondLargest = input[0];
        }
        for (int i = 2; i < input.length; i++) {
            if (input[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = input[i];
            } else {
                if (input[i] < firstLargest && input[i] > secondLargest) {
                    secondLargest = input[i];
                }
            }
        }
        return secondLargest;
    }

    public static int test(int[] a) {
        int fl, sl;
        if (a[0] > a[1]) {
            fl = a[0];
            sl = a[1];
        } else {
            fl = a[1];
            sl = a[0];
        }
        for (int i = 2; i < a.length; i++) {
            if (a[i] > fl) {
                sl = fl;
                fl = a[i];
            } else {
                if (a[i] < fl && a[i] > sl) {
                    sl = a[i];
                }
            }
        }
        return sl;
    }
}
public class Test3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String str = "00000000987";
//        System.out.println(secondLargest(array));
        System.out.println(removeleadingzeros2(str));
    }

    public static int secondLargest(int[] input) {
        int firstLargest, secondLargest;
        if (input[0] > input[1]) {
            firstLargest = input[0];
            secondLargest = input[1];
        } else {
            secondLargest = input[0];
            firstLargest = input[1];
        }
        for (int i = 2; i < input.length; i++) {
            if (input[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = input[i];
            } else if (input[i] < firstLargest && input[i] > secondLargest) {
                secondLargest = input[i];
            }
        }
        return secondLargest;
    }

    public static String removeleadingzeros(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0')
            i++;
        System.out.println(i);
        StringBuilder sb = new StringBuilder(str);
        sb.replace(0, i, "");

        return sb.toString();
    }

    public static String removeleadingzeros2(String str) {
        int i = 0;
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() >0 && sb.charAt(0) =='0')
            sb.deleteCharAt(0);

        return sb.toString();
    }
}
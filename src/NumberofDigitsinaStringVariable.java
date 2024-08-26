public class NumberofDigitsinaStringVariable {
    public static void main(String[] args) {
        String s = "248gty50";
        int count = 0;
        for (int i = 0;i<s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}

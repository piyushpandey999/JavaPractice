public class CountLongestUppercaseSubstring {

    public static void main(String[] args) {
        String str = "adhbVGTYTYTYTrtIOPLT";
        System.out.println(LongestUppercaseSubstring(str));
    }

    public static int LongestUppercaseSubstring(String s) {
        int curlen = 0;
        int maxlen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                curlen++;
                maxlen = Math.max(maxlen, curlen);
            } else {
                curlen = 0;
            }
        }

        return maxlen;
    }
}

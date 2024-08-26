public class PrintFirstCharcterofEachWordInAString {

    static char fisrtChar;

    public static void main(String[] args) {
        // String str = "preparation for the interviws";
        // String[] words = str.split(" ");
        // for (int i = 0; i < words.length; i++) {
        // String word = words[i];
        // char[] carray = word.toCharArray();
        // for (int j = 0; j < carray.length; j++) {
        // fisrtChar = carray[0];
        // }
        // }
        // System.out.println(fisrtChar);

        String str = "preparation for the interviws";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.println(word.charAt(0));
            // char[] carray = word.toCharArray();
            // System.out.println(carray);
        }
    }
}

public class ReverseAlternateWordsInaString {

    public static void main(String[] args) {
        String str = "ading this program in github repo";
        System.out.println(revsre(str));
    }

    public static String revsre(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (i%2!=0) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ",words);
    }
}


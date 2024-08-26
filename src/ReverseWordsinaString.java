public class ReverseWordsinaString {
    public static void main(String[] args) {
        String str = "this is java";
//        StringBuilder rev = new StringBuilder();
        String rev = "";
        String[] words = str.split(" ");
        for (int i=words.length-1;i>=0;i--){
//            rev.append(words[i]);
            rev = rev+words[i];
        }
        System.out.println(rev);
    }
}

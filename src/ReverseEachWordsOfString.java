public class ReverseEachWordsOfString {
    public static void main(String[] args) {

        reverse("this is java");
    }
    public static void reverse(String str){
        String revString ="";
        String[] words = str.split(" ");

        for(int i=0;i<words.length;i++){
            String word = words[i];
            String reverseWord = "";
            for (int j=word.length()-1;j>=0;j--){
                reverseWord = reverseWord + word.charAt(j);
            }
            revString = revString+reverseWord+ " ";
        }
        System.out.println(revString);
//
//        String revString = "";
//        String[] words = str.split(" ");
//        for (int i=0;i<words.length;i++){
//            String word = words[i];
//            String reverserWord = "";
//            for (int j=word.length()-1;j>=0;j--){
//                reverserWord = reverserWord+word.charAt(j);
//            }
//            revString = revString + reverserWord;
//        }
//        System.out.println(revString);
    }
}

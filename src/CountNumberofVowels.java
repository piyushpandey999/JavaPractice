public class CountNumberofVowels {
    public static void main(String[] args) {
        String str = "welcome";
        int count =0;
        char[] chr = str.toCharArray();
        for (int i = 0;i<str.length();i++) {
            if (chr[i]== 'a'  || chr[i]== 'e' || chr[i]=='i' || chr[i]=='o' || chr[i]=='u'){
                System.out.println(chr[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}

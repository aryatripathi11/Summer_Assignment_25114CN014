public class ques95 {

    static String replaceVowels(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                result = result + "*";
            } else {
                result = result + ch;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String str = "hello world";

        System.out.println(replaceVowels(str));
    }
}
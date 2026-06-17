public class ques82 {
    static String reverse(String str){
        String rev=" ";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        return rev;
    }
    public static void main(String[] args) {
        String str="hello world";
        System.out.println(reverse(str));
    }
}

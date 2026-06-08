public class ques45{
    public static boolean palindrome(int n){
        int n1=n;
        int r=0;
        while(n>0){
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        return n1==r;
    }

    public static void main(String[] args){
        int num=121;
        System.out.println(num + "is palindrome" + palindrome(num));

        
    }
}

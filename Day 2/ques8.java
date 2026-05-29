import java.util.Scanner;
public class ques8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int s=n;
        int r=0;
        while(n!=0){
            int a=n%10;
            r=r*10+a;
            n= n/10;
        }
        if(s==r)
            System.out.println(s + "is palindrome");
        else
            System.out.println(s + "is not palindrome");
    }
}
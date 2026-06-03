import java.util.Scanner;
public class ques27{
    public static int sumdigits(int n){
        if(n==0) return 0;
        int r=n%10;
        return r+sumdigits(n/10);
    }
        
    
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();
        System.out.println(sumdigits(n));
    }
}
        
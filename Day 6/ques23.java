import java.util.Scanner;
public class ques23{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();
        int count=0;
        while(n>0){
            int r= n&1;
            count=count+r;
            n=n>>1;
        }
        System.out.println(count);
    }
}
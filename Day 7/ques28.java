import java.util.Scanner;
public class ques28{
    public static void reverse(int n){
        if(n<10){
            System.out.println(n);
            return;
        }
        System.out.println(n%10);
        reverse(n/10);
    }
        
    
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();
        reverse(n);
    }
}
        

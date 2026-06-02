import java.util.Scanner;
public class ques24{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter x:");
        int x= sc.nextInt();
        
        System.out.println("enter n:");
        int n= sc.nextInt();
        int r=1;
        for(int i =1;i<=n;i++){
            r=r*x;
        }
        System.out.println(r);
    }
}

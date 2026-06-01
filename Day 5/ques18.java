import java.util.Scanner;
public class ques18{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();
        int n1=n , sum=0;
        while(n1>0){
            int r=n1%10;
            int fact=1;
            for(int i=1;i<=r;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n1=n1/10;
            
        }
        if(sum==n){
            System.out.println("strong number");
        }
        else{
            System.out.println("not strong number");
        }
    }
}
    
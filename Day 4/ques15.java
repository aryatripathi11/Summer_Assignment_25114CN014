import java.util.Scanner;
public class ques15{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();
        int n1=n;
        int count=0;
        int sum=0;
        int n2=n;
        while(n2>0){
            count++;
            n2=n2/10;
        }
        n2=n;
        while(n2>0){
            int r=n2%10;
            sum = sum + (int)Math.pow(r,count);
            n2=n2/10;
        }
        if(sum==n1){
            System.out.println(n1 +"is armstrong");
        }
        else{
            System.out.println(n1 +"is not armstrong");
        }
    }
}

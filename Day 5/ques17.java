import java.util.Scanner;
public class ques17{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();
        int r=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                r=r+i;

            }
        }
        if(n==r){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not perfect number");
        }
    }
}
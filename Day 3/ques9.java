import java.util.Scanner;
public class ques9{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();
        if(n==2){
            System.out.println("prime");
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i == 0){
                    System.out.println("not prime");
                    return;
                }
            }
            System.out.println("prime");
        }
    }
} 
    

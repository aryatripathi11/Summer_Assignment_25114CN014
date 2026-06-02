import java.util.Scanner;
public class ques22{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();
        int d=0;
        int p=0;
        while(n!=0){          //binay to decimal
            int r =  n%10;
            
            d+= r * Math.pow(2,p);
            
            n=n/10;
            p++;

        }
        System.out.println(d);
    }
}

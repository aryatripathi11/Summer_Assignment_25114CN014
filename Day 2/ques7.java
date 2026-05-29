import java.util.Scanner;
public class ques7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int p=1;
        while(n!=0){
            int r=n%10;
            p=p*r;
            n=n/10;
        }
        System.out.println("product of digits: " + p);
    }
}

import java.util.Scanner;

public class ques11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer n1: ");

        int n1 = scanner.nextInt();
        System.out.print("Enter a positive integer n2: ");
        int n2 = scanner.nextInt();
        int gcd = 1;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println("gcd is: " + gcd);
    }
}

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");

        int n = scanner.nextInt();

        int r = 0;
        while(n!=0){
            int digit = n%10;
            r = r*10 +digit;
            n=n/10;
        }
        System.out.println("reversed:" + r);
    }
}

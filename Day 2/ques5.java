import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");

        int n = scanner.nextInt();

        int sum = 0;
        while(n !=0){
            int r= n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("sum: "+ sum);
    }
}
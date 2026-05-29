import java.util.Scanner;

public class ques4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");

        int n = scanner.nextInt();
        int count = 0;
        if(n==0) count=1;
        while (n!=0){
            n=n/10;
            count=count+1;
        }
        System.out.println("number of digits: " + count);
    }
}

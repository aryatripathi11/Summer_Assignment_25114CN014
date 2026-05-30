import java.util.Scanner;

public class ques12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer n1: ");

        int n1 = scanner.nextInt();
        System.out.print("Enter a positive integer n2: ");
        int n2 = scanner.nextInt();
        int lcd = 1;
        while(lcd%n1!=0 || lcd%n2!=0){
            lcd++;
        }
        System.out.println("lcd is: " + lcd);
    }
}
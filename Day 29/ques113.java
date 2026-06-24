import java.util.Scanner;

public class ques113 {
    static void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    static void sub(int a, int b) {
        System.out.println("Difference = " + (a - b));
    }

    static void mul(int a, int b) {
        System.out.println("Product = " + (a * b));
    }

    static void div(int a, int b) {
        System.out.println("Division = " + (a / b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide");
        int choice = sc.nextInt();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (choice == 1) add(a, b);
        else if (choice == 2) sub(a, b);
        else if (choice == 3) mul(a, b);
        else if (choice == 4) div(a, b);
        else System.out.println("Invalid choice");
    }
}
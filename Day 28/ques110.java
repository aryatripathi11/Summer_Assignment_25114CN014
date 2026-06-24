import java.util.Scanner;

public class ques110 {
    static int balance = 1000;

    static void deposit(int amount) {
        balance = balance + amount;
    }

    static void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Current Balance: " + balance);

        System.out.print("Deposit amount: ");
        int d = sc.nextInt();
        deposit(d);

        System.out.print("Withdraw amount: ");
        int w = sc.nextInt();
        withdraw(w);

        System.out.println("Final Balance: " + balance);
    }
}
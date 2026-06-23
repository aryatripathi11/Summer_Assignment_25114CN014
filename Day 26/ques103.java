import java.util.Scanner;

public class ques103 {

    static void checkBalance(int balance) {
        System.out.println("Balance: " + balance);
    }

    static int deposit(int balance, int amount) {
        return balance + amount;
    }

    static int withdraw(int balance, int amount) {
        if (amount <= balance) {
            return balance - amount;
        } else {
            System.out.println("Insufficient balance");
            return balance;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                checkBalance(balance);
                break;
            case 2:
                System.out.print("Enter amount: ");
                balance = deposit(balance, sc.nextInt());
                checkBalance(balance);
                break;
            case 3:
                System.out.print("Enter amount: ");
                balance = withdraw(balance, sc.nextInt());
                checkBalance(balance);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

import java.util.Scanner;

public class ques107 {

    static int calculateSalary(int basic, int bonus) {
        return basic + bonus;
    }

    static void displaySalary(int total) {
        System.out.println("Total Salary: " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        int basic = sc.nextInt();

        System.out.print("Enter Bonus: ");
        int bonus = sc.nextInt();

        int total = calculateSalary(basic, bonus);
        displaySalary(total);
    }
}
import java.util.Scanner;

public class ques108 {

    static int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    static double calculatePercentage(int total) {
        return total / 3.0;
    }

    static void displayMarksheet(String name, int total, double percentage) {
        System.out.println("\n----- Marksheet -----");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 40) {
            System.out.println(" Pass");
        } else {
            System.out.println(" Fail");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter student name: ");
        String name = sc.nextLine();

        System.out.print("enter marks of subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("enter marks of subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("enter marks of subject 3: ");
        int m3 = sc.nextInt();

        int total = calculateTotal(m1, m2, m3);
        double percentage = calculatePercentage(total);

        displayMarksheet(name, total, percentage);
    }
}
import java.util.Scanner;

public class ques104 {

    static void Quiz() {
        Scanner sc = new Scanner(System.in);

        System.out.println("if your alarm rings at 7 am ,what will you do?");
        System.out.println("1. turn it off and sleep  2. wake up  3. snooze");
        int ans = sc.nextInt();

        if (ans == 1) {
            System.out.println("Correct Answer!");
        } else {
            System.out.println("Wrong Answer!");
        }
    }

    public static void main(String[] args) {
        Quiz();
    }
}

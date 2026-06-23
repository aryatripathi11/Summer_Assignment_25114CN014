import java.util.Scanner;

public class ques101 {
    static void guessGame() {
        Scanner sc = new Scanner(System.in);
        int number = 7;
        int guess = 0;

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct!");
            }
        }
    }

    public static void main(String[] args) {
        guessGame();
    }
}
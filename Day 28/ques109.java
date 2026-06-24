
import java.util.Scanner;

public class ques109{
    static String books[] = {"Java", "Python", "C++"};
    static boolean issued[] = {false, false, false};

    static void showBooks() {
        for (int i = 0; i < books.length; i++) {
            if (!issued[i]) {
                System.out.println((i + 1) + ". " + books[i]);
            }
        }
    }

    static void issueBook(int n) {
        issued[n - 1] = true;
        System.out.println("Book issued successfully");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Available Books:");
        showBooks();

        System.out.print("Enter book number: ");
        int n = sc.nextInt();

        issueBook(n);
    }
}
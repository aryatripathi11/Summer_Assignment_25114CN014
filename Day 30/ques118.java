import java.util.Scanner;

public class ques118 {
    static String books[] = {"the kite runner", "white nights", "little life"};
    static boolean issued[] = {false, false, false};

    static void showbooks() {
        for (int i = 0; i < books.length; i++) {
            if (!issued[i]) {
                System.out.println((i + 1) + ". " + books[i]);
            }
        }
    }

    static void issuebook(int n) {
        issued[n - 1] = true;
        System.out.println("book issued");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        showbooks();

        System.out.print("enter book number: ");
        int n = sc.nextInt();

        issuebook(n);
    }
}
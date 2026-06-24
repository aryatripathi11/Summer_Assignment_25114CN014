import java.util.Scanner;

public class ques115 {

    static void length(String str) {
        System.out.println("Length = " + str.length());
    }

    static void upper(String str) {
        System.out.println("Uppercase = " + str.toUpperCase());
    }

    static void lower(String str) {
        System.out.println("Lowercase = " + str.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("1.Length  2.Uppercase  3.Lowercase");
        int choice = sc.nextInt();

        if (choice == 1)
            length(str);
        else if (choice == 2)
            upper(str);
        else if (choice == 3)
            lower(str);
        else
            System.out.println("Invalid choice");
    }
}
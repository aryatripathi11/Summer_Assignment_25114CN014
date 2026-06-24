import java.util.Scanner;

public class ques112 {
    static String names[] = new String[5];
    static String numbers[] = new String[5];
    static int count = 0;

    static void addContact(String name, String number) {
        names[count] = name;
        numbers[count] = number;
        count++;
    }

    static void showContacts() {
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " - " + numbers[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number: ");
        String number = sc.nextLine();

        addContact(name, number);

        System.out.println("Saved Contacts:");
        showContacts();
    }
}
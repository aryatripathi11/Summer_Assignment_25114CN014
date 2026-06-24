import java.util.Scanner;

public class ques116 {

    static String items[] = new String[5];
    static int quantity[] = new int[5];
    static int count = 0;

    static void addItem(String name, int qty) {
        items[count] = name;
        quantity[count] = qty;
        count++;
    }

    static void showItems() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i] + " - " + quantity[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        addItem(name, qty);

        System.out.println("Inventory List:");
        showItems();
    }
}
import java.util.Scanner;

public class ques111 {
    static int seats = 5;
    static int price = 200;   // price of one ticket

    static void bookTicket(int n) {
        if (n <= seats) {
            seats = seats - n;
            int total = n * price;

            System.out.println("Booking successful");
            System.out.println("Total Price = " + total);
        } else {
            System.out.println("Seats not available");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Available seats: " + seats);
        System.out.println("Ticket price: " + price);

        System.out.print("Enter number of tickets: ");
        int n = sc.nextInt();

        bookTicket(n);

        System.out.println("Remaining seats: " + seats);
    }
}
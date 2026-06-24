import java.util.Scanner;

public class ques114 {

    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sum(int arr[]) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        System.out.println("Sum = " + s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};

        System.out.println("1.Display  2.Sum");
        int choice = sc.nextInt();

        if (choice == 1)
            display(arr);
        else if (choice == 2)
            sum(arr);
        else
            System.out.println("Invalid choice");
    }
}
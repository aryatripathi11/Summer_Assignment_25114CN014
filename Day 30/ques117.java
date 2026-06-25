import java.util.Scanner;

public class ques117 {
    static String names[] = new String[5];
    static int marks[] = new int[5];
    static int count = 0;

    static void addst(String name, int mark) {
        names[count] = name;
        marks[count] = mark;
        count++;
    }

    static void showst() {
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " - " + marks[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter student name: ");
        String name = sc.nextLine();

        System.out.print("enter marks: ");
        int mark = sc.nextInt();

        addst(name, mark);

        System.out.println("student records:");
        showst();
    }
}
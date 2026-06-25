import java.util.Scanner;

public class ques119 {
    static String names[] = new String[5];
    static int salary[] = new int[5];
    static int count = 0;

    static void addemp(String name, int sal) {
        names[count] = name;
        salary[count] = sal;
        count++;
    }

    static void showemp() {
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " - " + salary[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter employee name: ");
        String name = sc.nextLine();

        System.out.print("enter salary: ");
        int sal = sc.nextInt();

        addemp(name, sal);

        System.out.println("employee records:");
        showemp();
    }
}

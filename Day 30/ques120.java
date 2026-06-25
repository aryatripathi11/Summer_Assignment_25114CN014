import java.util.Scanner;

public class ques120 {
    static String movies[] = new String[5];
    static int price[] = new int[5];
    static int count = 0;

    static void addmovie(String name, int p) {
        movies[count] = name;
        price[count] = p;
        count++;
    }

    static void showmovies() {
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + movies[i] + " - " + price[i]);
        }
    }

    static void bookticket(int n) {
        System.out.println("Booked: " + movies[n - 1]);
        System.out.println("Price: " + price[n - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        addmovie("Avengers", 250);
        addmovie("Batman", 200);
        addmovie("Spiderman", 300);

        System.out.println("available movies:");
        showmovies();

        System.out.print("choose movie number: ");
        int n = sc.nextInt();

        bookticket(n);
    }
}
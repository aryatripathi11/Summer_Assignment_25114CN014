import java.util.Scanner;

public class ques2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");

        int n = scanner.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(n +"x"+i+"="+(n*i));  
        }
    }    
}
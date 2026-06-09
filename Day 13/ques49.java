import java.util.Scanner;
public class ques49 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size: ");
        int n= sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}

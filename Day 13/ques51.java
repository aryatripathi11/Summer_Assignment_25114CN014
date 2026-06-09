import java.util.Scanner;
public class ques51 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size: ");
        int n= sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("max is: " + max);
        System.out.println("min is: " + min);
    }
}
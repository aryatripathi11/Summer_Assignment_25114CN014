import java.util.Scanner;
public class ques21{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();
        String binary="";
        while(n>0){               //decimal to binary
            int d=n%2;
            binary= d+binary;
            n=n/2;
        }
        System.out.println(binary);
    }
}
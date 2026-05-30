import java.util.Scanner;
public class ques10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter lower and upper bound number: ");
        int l= sc.nextInt() , h= sc.nextInt();
        for(int i = l;i<=h;i++){
            if(i<=1)
                continue;
            int j;
            for (j=2; j<i ; j++){
                if(i%j == 0){
                    break;
                }
            }
            if(j==i){
                System.out.println(i + " ");
            }
        }
    }
}
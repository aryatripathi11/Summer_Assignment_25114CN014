import java.util.Scanner;
public class ques16{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n1:");
        int n1= sc.nextInt();
        System.out.println("enter n2:");
        int n2= sc.nextInt();
        for(int i=n1;i<=n2;i++){
            int temp=i;
            int count=0;
            while(temp>0){
                count++;
                temp=temp/10;
            }
            int tempp=i;
            int sum=0;
            while(tempp>0){
                int r=tempp%10;
                sum=sum+(int)Math.pow(r,count);
                tempp=tempp/10;

            }
            if(sum==i){
                System.out.println(i + " ");
            }
        }
            

    }
}

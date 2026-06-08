public class ques46{
    public static boolean armstrong(int n){
        int n1=n,sum=0,n2=n,d=0;
        while(n1>0){
            d++;
            n1=n1/10;
        }
        n1=n;
        while(n1>0){
            int r=n1%10;
            sum+=Math.pow(r,d);
            n1=n1/10;
        }
        return(sum==n2);
    }
    public static void main(String[] args) {
        int num=153;
        System.out.println(armstrong(num));
    }
}
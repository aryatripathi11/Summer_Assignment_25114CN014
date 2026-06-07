public class ques44{
    public static int fact(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[]args){
        int num=5;
        System.out.println("Factorial is: " + fact(num));
    }
}
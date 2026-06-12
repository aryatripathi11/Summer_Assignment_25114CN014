public class ques61{
    static int missing(int arr[],int n){
        int sum= n*(n+1)/2;
        int arrsum=0;
        for(int num:arr){
            arrsum=arrsum+num;
        }
        return sum-arrsum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int n=5;
        System.out.println(missing(arr, n));
    }
}
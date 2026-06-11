public class ques57 {
    static void ReverseArray(int arr[]){
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr={12,50,41,26,39,87,75};
        ReverseArray(arr);
    }
}

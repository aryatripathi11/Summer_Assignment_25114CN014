public class ques60 {
    static void MoveZeroes(int arr[]){
        int  j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<arr.length){
            arr[j]=0;
            j++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,0,0,5,0,6,8,7,0,9,3};
        MoveZeroes(arr);
    }
}

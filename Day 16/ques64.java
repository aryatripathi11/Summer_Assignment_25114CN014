public class ques64 {
    static int removeDuplicates(int[] arr) {
        if(arr.length==0) return 0;
        int k=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[k-1]){
            arr[k]=arr[i];
            k++;
            }
        }
    return k;    
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,4,5,5,6};
        int length = removeDuplicates(arr);
        for(int i=0;i<length;i++){
            System.out.print(arr[i] + " ");
        }
    }
   
}
    

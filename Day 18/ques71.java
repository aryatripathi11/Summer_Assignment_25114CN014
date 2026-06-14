public class ques71 {
    static int binarysearch(int[] arr,int n){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(n < arr[mid]){
                end=mid-1;
            }
            else if (n > arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[]={1,5,4,9,8,3};
        int n=8;
        System.out.print(binarysearch(arr,n));
    }
    
}

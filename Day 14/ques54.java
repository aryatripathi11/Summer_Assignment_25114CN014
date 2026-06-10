public class ques54 {
    static int frequency(int arr[], int target){
        int count =0;
        for(int num : arr){
            if(num== target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={25,14,71,89,65,32,25,17,65,25};
        int target = 65;
        System.out.println (frequency(arr,target));
    }
    
}

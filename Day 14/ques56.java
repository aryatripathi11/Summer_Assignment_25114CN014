public class ques56 {
    static int duplicate(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                    
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,26,15,84,12,47};
        System.out.println(duplicate(arr));
    }
    
}

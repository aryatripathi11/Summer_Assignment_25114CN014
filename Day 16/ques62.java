public class ques62 {
    static int maxfreq(int arr[]){
        int max=0,element=arr[0];
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>max){
                max=count;
                element=arr[i];
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,3,5,4,5,6,1,2,1,8};
        System.out.println(maxfreq(arr));
    }
    
}

public class ques66{
    static void union(int arr1[], int arr2[]){
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        for(int i=0;i<arr2.length;i++){
            boolean found=false;
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.print(arr2[i] + " ");
            }

       }
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={2,4,6,7,8};
        union(arr1, arr2);
    }
}
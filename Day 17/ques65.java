public class ques65{
    static void merge(int arr1[], int arr2[]){
        int merge[]=new int[arr1.length + arr2.length];
        for(int i=0;i<arr1.length;i++){
            merge[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            merge[arr1.length + i]= arr2[i];
        }
        for(int i=0;i<merge.length;i++){
            System.out.print(merge[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        merge(arr1, arr2);
    }
}
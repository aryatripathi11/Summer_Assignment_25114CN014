public class ques97 {
    static void merge(int arr1[],int arr2[]){
        int merged[]=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                merged[k++]=arr1[i++];
            }
            else{
                merged[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            merged[k++]=arr1[i++];
        }
        while(j<arr2.length){
            merged[k++]=arr2[j++];
        }
        for(int index=0;index<merged.length;index++){
            System.out.print(merged[index] + " ");
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,3,4};
        int arr2[]={2,5,6};
        merge(arr1, arr2);
    }
}

public class ques53 {
    static int LinearSearch(int []arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] num={23,15,4,87,25,20,60,91};
        int target = 91;
        System.out.println(LinearSearch(num, target));
    }
    
}

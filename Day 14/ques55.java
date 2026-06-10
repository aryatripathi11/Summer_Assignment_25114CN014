public class ques55 {
    static int SecMax(int arr[]){
        int max = arr[0];
        int SecMax= arr[0];
        for(int num:arr){
            if(num>max){
                SecMax=max;
                max=num;
            }else if(num>SecMax && num!=max){
                SecMax=num;
            }
        }
        return SecMax;
    }
    public static void main(String[] args) {
        int arr[]={12,51,48,65,96,32,99,77,54};
        System.out.println(SecMax(arr));
    }
    
}

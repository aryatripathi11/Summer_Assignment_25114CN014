public class ques80 {
    static void colsum(int a[][]){
        for(int i=0;i<a[0].length;i++){
            int sum=0;
            for(int j=0;j<a.length;j++){
                sum=sum+a[j][i];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6}};
        colsum(a);
    }
    
}

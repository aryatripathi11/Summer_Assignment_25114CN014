public class ques79 {
    static void rowsum(int a[][]){
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6}};
        rowsum(a);
    }
}

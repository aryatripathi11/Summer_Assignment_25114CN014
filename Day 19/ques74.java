public class ques74 {
    static void submatrices(int a[][], int b[][]){
        int rows=a.length;
        int col=a[0].length;
        int sum[][]=new int [rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                sum[i][j]=a[i][j]-b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[][]={{2,4,6},{1,3,5}};
        int b[][]={{1,2,3},{4,5,6}};
        submatrices(a,b);
    }
    
}

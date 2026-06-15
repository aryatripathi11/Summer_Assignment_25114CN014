public class ques75 {
    static void transpose(int a[][]){
        int rows=a.length;
        int col=a[0].length;
       
        for(int i=0;i<col;i++){
            for(int j=0;j<rows;j++){
                
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6}};
        transpose(a);
    }
    
}

public class ques76 {
    static void sumdiagonal(int a[][]){
        int rows=a.length;
        
        int sumleft=0;
        int sumright=0;
        for(int i=0;i<rows;i++){
            sumleft+=a[i][i];
            sumright+=a[i][rows-1-i];
        }
        System.out.println("sum of left diagonal: " + sumleft);
        System.out.println("sum of right diagonal: " + sumright);
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{2,1,3}};
        sumdiagonal(a);
    }
}

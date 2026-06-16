public class java78 {
    static void checksymmetric(int a[][]){
        boolean symmetric=true;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]!=a[j][i]){
                    symmetric=false;
                }
            }
        }
        if(symmetric){
            System.out.println("symmetric");
        }
        else{
            System.out.println("not symmetric");
        }
    }
    public static void main(String[] args) {
        int a[][] ={{1,2},{2,1}};
        checksymmetric(a);
    }
    
}

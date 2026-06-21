import java.util.Arrays;

public class ques99 {
    static void sortnames(String names[]){
        Arrays.sort(names);
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
    public static void main(String[] args) {
        String names[]={"arya","anya","anvi","avni"};
        sortnames(names);
    }
}

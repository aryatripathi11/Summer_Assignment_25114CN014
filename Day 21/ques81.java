public class ques81 {
    static int stringlength(String str){
        int count=0;
        for(char ch: str.toCharArray()){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str="hello";
        System.out.println(stringlength(str));
    }
    
}

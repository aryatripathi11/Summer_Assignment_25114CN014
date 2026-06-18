public class ques86 {
    static int countwords(String str){
        int count=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        String str="Hello my name is ARYA";
        System.out.println(countwords(str));
    }
}

public class ques93 {
    static String reversewords(String str){
        String word="";
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                word=str.charAt(i) + word;
            }
            else{
                ans=ans+word+" ";
                word="";
            }
        }
        ans=ans+word;
        return ans;
    }
    public static void main(String[]args){
        String str="Hello my name is ARYA";
        System.out.println(reversewords(str));
    }
}

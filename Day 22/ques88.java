public class ques88 {
    static String removespaces(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                ans=ans+str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[]args){
        String str="hey my name is arya";
        System.out.println(removespaces(str));
    }
    
}

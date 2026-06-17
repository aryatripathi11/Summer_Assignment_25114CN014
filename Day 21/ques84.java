public class ques84 {
    static String lowtoupcase(String str){
        String upper=" ";
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch >='a'&& ch<='z'){
                upper=upper+(char)(ch-32);
            }
            else{
                upper=upper+ch;
            }
        }
        return upper;
    }
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(lowtoupcase(str));
    }
    
}

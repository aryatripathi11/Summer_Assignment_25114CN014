public class ques98 {
    static void commonchar(String str1,String str2){
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(str2.indexOf(ch)!=-1){
                System.out.print(ch +" ");
            }
        }
    }
    public static void main(String[] args) {
        String str1="hey";
        String str2="my name is arya";
        commonchar(str1, str2);
    }
    
}
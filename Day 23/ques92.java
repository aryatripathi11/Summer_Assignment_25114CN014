public class ques92 {
    static char maxchar(String str){
        int max=0;
        char maxch=' ';
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>max){
                max=count;
                maxch=str.charAt(i);
            }
        }
        return maxch;
    }
    public static void main(String[] args) {
        String str="hello everyone my name is arya";
        System.out.println(maxchar(str));
    }
}

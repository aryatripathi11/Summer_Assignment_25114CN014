public class ques90 {

    static char firstrepeating(String str){
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    return str.charAt(i);
                }
            }
        }
        return '-';
    }
    public static void main(String[] args) {
        String str="arryya";
        char ch=firstrepeating(str);
        if(ch=='-'){
            System.out.println("no non repeating character");
        }
        else{
            System.out.println(ch);
        }
    }
}
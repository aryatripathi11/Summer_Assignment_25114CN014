public class ques89 {
    static char firstnonrepeating(String str){
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                return str.charAt(i);
            }
        }
        return '-';
    }
    public static void main(String[] args) {
        String str="arryya";
        char ch=firstnonrepeating(str);
        if(ch=='-'){
            System.out.println("no non repeating character");
        }
        else{
            System.out.println(ch);
        }
    }
}

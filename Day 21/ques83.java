public class ques83 {
    static void vowelconso(String str){
        int vowels=0,consonants=0;
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
            System.out.println("vowels: " + vowels);
            System.out.println("consonants:" + consonants);
        

    }
    public static void main(String[] args) {
        String str="hello";
        vowelconso(str);
    }
}

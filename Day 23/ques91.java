public class ques91 {
    static boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    char temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
                if(arr2[i]>arr2[j]){
                    char temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="arya";
        String str2="anya";
        if(anagram(str1, str2)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
}

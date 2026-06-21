public class ques100 {
    static void sortwords(String words[]){
        for(int i=0;i<words.length-1;i++){
            for(int j=0;j<words.length-1;j++){
                if(words[j].length()>words[j+1].length()){
                    String temp=words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp;
                }
            }
        }
        for(int k=0;k<words.length;k++){
            System.out.println(words[k]);
        }
    }
    public static void main(String[] args) {
        String words[]={"hey","my","name","is","arya"};
        sortwords(words);
    }
}


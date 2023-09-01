package strings;

public class permutations {
    public static void main(String[] args) {
        String str = "123";
        permutation(str, "");
    }

    public static void permutation(String str, String word){
        if(str.length() == 0){
            System.out.println(word);
            return;
        }
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            String ans = left+right;
            permutation(ans, word +ch);
            
        }

    }
    
}

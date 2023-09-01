package strings;

import java.util.Arrays;

public class duplicates {
    public static void main(String[] args) {
        String A = "PRAKASH";

        char[] AcharArray = A.toCharArray();
        Arrays.sort(AcharArray);
        for(int i =1; i<A.length(); i++){
            if(AcharArray[i] == AcharArray[i-1]){
                System.out.println(AcharArray[i]);
            }
        }
    }    
}

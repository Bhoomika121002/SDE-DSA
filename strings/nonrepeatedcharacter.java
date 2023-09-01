package strings;

import java.util.Arrays;

public class nonrepeatedcharacter {
    public static void main(String[] args) {
        String s1 = "netsetosnet";
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        for(int i=1; i<c1.length; i++){
            if(c1[i] != c1[i-1]  && c1[i] != c1[i+1]){
                System.out.println(c1[i]);
            }
        }
    }   
}

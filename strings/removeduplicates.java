package strings;

import java.util.HashSet;

public class removeduplicates {
    public static void main(String[] args) {
        String str = "abababcccddd";
        //System.out.println(remove(str));
        removee(str);

    }
    public static String remove(String str){

        String newstr= "";   //new string created
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(newstr.indexOf(ch) == -1){
                newstr += ch;
            }
        }
        return newstr;
    }
    public static void removee(String str){
        HashSet <Character> set = new HashSet<>();

         for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(set.add(ch)){
                System.out.println(ch);
            }
    }
    
}}

package strings;

public class reverseusingrecursion {
    public static void main(String[] args) {
        String s ="sandy";
        System.out.println(recursion(s));
    }
    public static String recursion(String s){
        if(s == null || s.length() <=1){
            return s;
        }
        return recursion(s.substring(1)) + s.charAt(0);
    }
}

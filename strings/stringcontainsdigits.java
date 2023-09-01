package strings;

public class stringcontainsdigits {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(stringdigits(str));
    }
    public static boolean stringdigits(String str){
        if(str == null || str.isBlank()){
            return false;
        }
        for(int i =0; i<str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}

package strings;

public class rotation {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        if(s1.length() != s2.length()){
            System.out.println("not in rotation");

        }
        String s3 = s1+s1;
            if(s3.indexOf(s2) != -1){
                System.out.println("rotation");
            } else{
                System.out.println("not rotation");
            }

        }


    }
    
    


package strings;

public class vowelsconsonants {
    public static void main(String[] args) {
        String str = "jaya";
        
        vowelsconsonantscount(str);

    }

    public static void vowelsconsonantscount(String str){

        char[] c1 = str.toCharArray();
        int count = 0;
        int consonantcount =0; 
        for(int i = 0; i<c1.length; i++){
            if(c1[i] == 'a' || c1[i] == 'e' || c1[i] == 'i' || c1[i] == 'o' || c1[i] == 'u' ){
                count = count +1;
            }
            else{
                consonantcount = consonantcount +1;  
            }
        }
        System.out.println("vowels are" + count);
        System.out.println("consonants are" + consonantcount);
    }
    
}

import java.util.*;
public class main13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        
        int vowels = 0 , consonants = 0;

        // for(int i=0;i<str.length();i++){

        //     if(str.charAt(i) == ' ') continue;

        //     if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'||
        //     str.charAt(i) == 'u'){
        //         vowels++;
        //     }else{
        //         consonants++;
        //     }
        // }
        for(char ch : str.toCharArray()){

            if(ch == ' ') continue;

            if("aeiou".indexOf(ch) != -1){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Vowels : " + vowels );        
        System.out.println("Consonants : " + consonants );        
    }
}
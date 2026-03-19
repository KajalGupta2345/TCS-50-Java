import java.util.*;

public class main30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        //Method - 1
        // s = s.replaceAll(" ", "");
        // System.out.println(s);
        String str = "";
       for(int i =0;i<s.length();i++){
           char ch = s.charAt(i);
           if(ch == ' '){
               continue;
           }else{
              str +=ch;
           }
       }
       System.out.println(str);
    }
}

import java.util.*;

public class main47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          String str = sc.nextLine();
          char ch = sc.next().charAt(0);
          String s = "";
        //method - 1
        //   for(int i = 0 ; i < str.length();i++){
        //     if(str.charAt(i) == ch){
        //       continue;
        //     }else{
        //         s += str.charAt(i);
        //     }
        //   }
        //   System.out.println(s);
        // method - 2
        str = str.replace(Character.toString(ch) , "");
        System.err.println(str);
    }
}

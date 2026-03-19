import java.util.*;

public class main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String rev = "";
        for(int i = 0;i<s.length();i++){
            if(rev.indexOf(s.charAt(i)) == -1){
                rev += s.charAt(i);
            }
        }
        System.out.println(rev);
    }
}

import java.util.*;

public class main41 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String bin = sc.nextLine();
          int dec = 0 , exp = 0;
          for(int i = bin.length()-1;i>=0;i--){
            if(bin.charAt(i) == '1'){
                dec += Math.pow(2,exp);
            }
            exp++;
          }
          System.err.println("decimal : " + dec);
          
    }
}

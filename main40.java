import java.util.*;

public class main40 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          StringBuilder sb = new StringBuilder();
          while( n > 0){
            int rem = n % 2;
            sb.append(rem);
            n = n / 2;
          }
          System.out.println(sb.reverse());
    }
}

import java.util.*;

public class main42 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int sum = 1;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                sum += i;

                if(i != n/i){
                    sum+=n/i;
                }
            }
        }
        System.out.println( sum == n ? "perfect" : "not perfect");
    }
}

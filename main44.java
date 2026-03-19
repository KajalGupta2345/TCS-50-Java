import java.util.*;

public class main44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
       System.out.println("Even Count - " + even);
       System.out.println("Odd Count - " + odd);

    }
}

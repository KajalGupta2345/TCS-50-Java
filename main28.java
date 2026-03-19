import java.util.*;

public class main28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        for(int i=0;i < n-1;i++){
            arr[i] = sc.nextInt();
        }
        //Method 1 -
        // int total = n * (n+1) / 2;
        // int sum = 0;
        // for(int num : arr){
        //     sum += num;
        // }
        // System.out.println(total-sum);
        //Method 2 -
        int xor = 0;
        for(int i = 1; i<=n ;i++) xor^=i;
        for(int num : arr) xor^=num;
        System.out.println("missing number is : " + xor);
    }
}

import java.util.*;

public class main18 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        // int i ;
        // for( i =0;i<arr.length;i++){
        //     if(arr[i] == x)
        //         break;
        // }
        // if(i == arr.length-1) System.out.println("Element is not present in array");
        // else System.out.println("Element is present in array");
        boolean found = false;
        for(int num : arr){
            if(num == x){
                found = true;
                break;
            }
        }
        System.out.println(found?"Found":"Not Found");
    }
}

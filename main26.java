import java.util.*;

public class main26 {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean sorted = true;
         for(int i=0;i<arr.length-1;i++){
           if(arr[i] > arr[i+1]){
            sorted = false;
              break;
           }
       }
       System.err.println(sorted?"Array is sorted":"Array is not sorted");
   } 
}

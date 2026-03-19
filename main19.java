import java.util.*;

public class main19 {

    // public static boolean BinarySearch(int arr[],int target){
    //     int s = 0 , e = arr.length-1;
    //     while(s <= e){
    //       int mid = (s+e)/2;
    //       if(arr[mid] == target) return true;
    //       else if(arr[mid] < target){
    //         s = mid + 1;
    //       }else{
    //         e = mid - 1;
    //       }
    //     }
    //     return false;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        // System.out.println(BinarySearch(arr, x));
        int s = 0 , e = arr.length-1;
        boolean found = false;
        while(s <= e){
          int mid = (s+e)/2;
          if(arr[mid] == x){
             found = true;
             break;
          }
          else if(arr[mid] < x){
            s = mid + 1;
          }else{
            e = mid - 1;
          }
        }
        System.out.println(found?"Found":"Not found");
    }
}

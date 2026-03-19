import java.util.*;

public class main50 {
  public static int[] twoSum(int arr[],int target){
     HashMap<Integer,Integer>map = new HashMap<>();

     for(int i=0;i<arr.length;i++){
      int com = target - arr[i];

      if(map.containsKey(com)){
        return new int[]{map.get(com),i};
      }
        map.put(arr[i],i);
      
     }
     return new int[]{-1,-1};
  }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
          int arr[] = new int[n];
          for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
          }
          int target = sc.nextInt();
          int ans[] = new int[2];

          // for(int i = 0;i<n;i++){
          //   for(int j = i+1;j<n;j++){
          //       if(arr[i]+arr[j] == target){
          //      System.out.println(i + "," + j);
          //      return;
          //   }
          //   }
          // }
          // System.out.println("No Pair Found");
           ans = twoSum(arr, target);
          System.out.println(ans[0] + "," + ans[1]);
          

    }
}

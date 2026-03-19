import java.util.*;

public class main27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        int merge[] = new int[n1+n2];
        for(int i = 0 ;i<n1;i++){
            merge[i] = arr1[i];
        }
        for(int i = 0 ;i<n2;i++){
            merge[n1+i] = arr2[i];
        }
        for(int num : merge){
          System.out.print(num+" ");
        }
    }
}

//  public void merge(int[] nums1, int m, int[] nums2, int n) {
//          int i = m - 1, j = n-1 ,  k = (m+n) - 1;
//     while(i >= 0 && j >= 0){
//         if(nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
//         else nums1[k--] = nums2[j--];
//     }
//     while(j >= 0){
//        nums1[k--] = nums2[j--]; 
//     }
//     }

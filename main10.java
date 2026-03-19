// import java.util.*;

// Brute Force
// public class main10 {
//     public static void main(String[] args) { //O(min(a,b))
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//        int GCD = 0;
//         for(int i=Math.min(a,b);i >= 1;i--){
//             if(a % i == 0 && b % i == 0){
//               GCD = i;
//               break;
//             }
//         }      
        
//         System.out.println("GCD : "+GCD);
//     }
// }  

// Optimized Approach
// public class main10 {
//     public static void main(String[] args) { // O(max(a,b))
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//        while(a > 0 && b > 0){
//             if(a > b) a = a - b;
//             else b = b - a;
//         }
//         System.out.println(a == 0 ? b : a);
//     }
// }        
// very Optimized Approach
// public class main10 {
//     public static void main(String[] args) { // O(logbasefie(min(a,b)))
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         while(a > 0 && b > 0){
//             if(a > b) a = a % b;
//             else b = b % a;
//         }
//         System.out.println(a == 0 ? b : a);
//     }
// }

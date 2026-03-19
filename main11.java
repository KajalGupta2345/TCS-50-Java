// import java.util.*;

// public class main11 {
    // public static void main(String[] args) { // a*b - max(a,b)
    //       Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //       int res =  Math.max(a,b); 
        
    //     while(true){
    //         if(res % a == 0 && res % b == 0){
    //           break; 
    //         }
    //         res++;
    //     }
    //     System.out.println("LCM : " + res);

    // }
// }
// public class main11 { //O(log(min(a,b)))

//      public static int GCD(int a,int b){
//         while(a>0&& b>0){
//             if(a>b) a = a% b;
//             else b = b % a;
//         }
//         return a == 0 ? b : a;
//     }
//     public static void main(String[] args) { // a*b - max(a,b)
//           Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//     System.out.println("LCM : " + (a * b) / GCD(a,b)); 

//     }
// }

import java.util.*;

public class main12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // if(x % 100 == 0){
        //     if(x % 400 == 0){
        //         System.out.println(x + " is a leap year");
        //     }else{
        //         System.out.println(x + " is not a leap year");
        //     }
        // }else{
        //     if(x % 4 == 0){
        //         System.out.println(x + " is a leap year");
        //     }else{
        //         System.out.println(x + " is not a leap year");
        //     }
        // }
        if(x % 100 == 0 && x % 400 == 0 || x % 4 == 0){
                System.out.println(x + " is a leap year");
        }else{
                System.out.println(x + " is not a leap year");
        }
        
    }
}
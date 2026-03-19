import java.util.*;

public class main46 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String str = sc.nextLine();
          String sub = sc.nextLine();
        
        // Method - 1
        //   if(str.contains(sub)){
        //     System.out.println("substring is present");
        //   }else{
        //     System.out.println("substring is not present");
        //   }

        // Method - 2
        // First Occurence
        int i = 0 , j = 0;
        boolean found = false;
        while(i < str.length()){
          if(str.charAt(i) == sub.charAt(j)){
            i++;
            j++;
            if(j == sub.length()){
                found = true;
               break;
            }
          }else{ 
            i = i-j+1;
            j=0;
          }
        }
        System.out.println(found ? i-j:-1);

    }
}

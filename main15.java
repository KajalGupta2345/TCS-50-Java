import java.util.*;

public class main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        // for(int i = 0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }
         System.out.println(Arrays.equals(a,b) ? true : false);
    }
}

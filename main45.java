import java.util.*;

public class main45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int a[] = new int[n1];
        int b[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        // Intersection of Two arrays without Duplicate Elements

        // for(int i = 0;i<n1;i++){
        //      for(int j=0;j<n2;j++){
        //          if(a[i] == b[j] ){
        //              System.out.print(a[i] + " ");
        //              break;
        //          }
        //      }
        //  }

        // Intersection of Two arrays with Duplicate Elements
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0 , j = 0;
        while(i < a.length && j < b.length){
            if(i > 0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            if(a[i] == b[j]){
              ans.add(b[j]);
              i++;
              j++;
            }else if(b[j] < a[i]){
                j++;
            }else{
                i++;
            }
        }
        System.out.println(ans);

    }
}

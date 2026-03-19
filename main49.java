import java.util.*;

public class main49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();
          String words[] = s.split(" ");
          int i = 0 , j = words.length-1;
          while(j >= i){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            j--;
            i++;
          }
          System.out.println(String.join(" ",words));

    }
}
// "i.like.this.program.very.much"
// "i like this program very much"
//  String words[] = s.split("\\.");
//          ArrayList<String> list = new ArrayList<>();

//         // empty strings remove karo
//         for(String word : words){
//             if(!word.equals("")){
//                 list.add(word);
//             }
//         }
//           int i = 0, j = list.size() - 1;

//         while(i < j){
//             String temp = list.get(i);
//             list.set(i, list.get(j));
//             list.set(j, temp);
//             i++;
//             j--;
//         }

//         return String.join(".", list);

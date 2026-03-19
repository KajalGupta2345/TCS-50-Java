import java.util.*;

public class main29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        s = s.replace("\\n", " ") .replace("\\t", " ").trim();
        System.out.println(s);
        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            String words[] = s.split("\\s+");
            System.out.println(words.length);
        }

    }
}

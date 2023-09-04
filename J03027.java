import java.util.*;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        while (true) {
            boolean ok = false;
            for (int i = 0; i < s.length() - 1; ++i) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    ok = true;
                    s = s.substring(0, i) + s.substring(i + 2);
                    break;
                }
            }
            
            if (!ok) {
                break;
            }
        }
        
        if (s.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(s);
        }
    }
}
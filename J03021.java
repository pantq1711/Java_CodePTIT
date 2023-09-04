import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class J03021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().trim().toLowerCase();
            String tmp = "";
            int l = 0, r = s.length();
            while(l < r){
                while (l + 1 < r && convert(s.charAt(l)) == convert(s.charAt(l + 1))) ++l;
                tmp += convert(s.charAt(l));
                ++l;
            }
            if (check(tmp)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static char convert(char c) {
        if (c == 'a' || c == 'b' || c == 'c') return '2';
        else if (c == 'd' || c == 'e' || c == 'f') return '3';
        else if (c == 'g' || c == 'h' || c == 'i') return '4';
        else if (c == 'j' || c == 'k' || c == 'l') return '5';
        else if (c == 'm' || c == 'n' || c == 'o') return '6';
        else if (c == 'p' || c == 'q' || c == 'r' || c == 's') return '7';
        else if (c == 't' || c == 'u' || c == 'v') return '8';
        else return '9';
    }

    public static boolean check(String s) {
        StringBuilder tmp = new StringBuilder(s);
        return s.equals(tmp.reverse().toString());
    }
}

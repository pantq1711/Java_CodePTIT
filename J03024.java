import java.util.*;
public class J03024{
    public static boolean check(String n){
        int cnt1 = 0, cnt2 = 0;
        for(int i=0; i<n.length(); ++i){
            if((n.charAt(i) - '0')  % 2 == 0) ++cnt1;
            else ++cnt2;
        }
        return (n.length() % 2 == 0 && cnt1 > cnt2) || (n.length() % 2 == 1 && cnt1 < cnt2);
    }
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t-- >0){
        String s = sc.nextLine();
        boolean ok = false;
        for(int i=0; i<s.length(); ++i){
            if(!Character.isDigit(s.charAt(i))) ok = true;
        }
        if(ok) System.out.println("INVALID");
        else {
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
}
// 3
// 01234aa32432432432534545b987978
// 1234567890123456789000
// 999999999999999999999999999999
import java.util.*;
public class J03005{
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t-- >0){
        String s = sc.nextLine();
        String x = "";
        Vector <String>  v = new Vector<String>();
        s = s.toLowerCase() + " ";
        for(int i=0; i<s.length(); ++i){
            if(s.charAt(i) == ' '){
                if(x != ""){
                    v.add(x);
                    x = "";
                }
            }
            else x += s.charAt(i);
        }
        for(int i=1; i<v.size(); ++i){
            String a = "";
            String tmp = v.get(i);
            a += tmp.substring(0, 1).toUpperCase();
            a += tmp.substring(1);
            System.out.print(a);
            if(i != v.size() - 1) System.out.print(" ");
        }
        System.out.println(", " + v.get(0).toUpperCase());
    }
}
}
// 4
//     nGUYEn   quaNG   vInH  
//    tRan   thi THU    huOnG
//    nGO   quoC  VINH
//  lE            tuAn    aNH
import java.util.*;

public class J03010
{
    public static void main(String[] args)
    {   
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            Map<String, Integer> mp = new HashMap<String, Integer>();
            while(t-- >0){
                String n = sc.nextLine();
                Vector <String> v = new Vector<String>();
                n = n.toLowerCase() + " ";
                String x = "";
                for(int i=0; i<n.length(); ++i){
                    if(n.charAt(i) == ' '){
                        if(x != ""){
                            v.add(x);
                            x = "";
                        }
                    }
                    else x += n.charAt(i);
                }
                String s = v.get(v.size()-1);
                for(int i=0; i<v.size()-1; ++i){
                    s += v.get(i).substring(0,1);
                }
                if(mp.get(s) == null){
                    mp.put(s, 1);
                    x = "";
                }
                else {
                    x = Integer.toString(mp.get(s) + 1);
                    mp.put(s, mp.get(s) + 1);
                }
                System.out.println(s + x + "@ptit.edu.vn");
            }
        }
    }
}
// 4
//     nGUYEn    quaNG   vInH  
//    tRan   thi THU    huOnG
//    nGO   quoC  VINH
//  lE            tuAn    aNH
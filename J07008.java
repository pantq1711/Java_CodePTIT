import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class J07008{
    static int n;
    static int [] a = new int[25];
    static int [] x = new int[25];
    static int ok;
    static String k;
    static ArrayList<String> vs = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static void ktao(){
        for(int i=1; i<=n; ++i) x[i] = 0;
    }
    public static void sinh(){
        int i = n;
        while(i >= 1 && x[i] == 1){
            x[i] = 0;
            --i; 
        }
        if(i == 0) ok = 0;
        else {
            x[i] = 1;
        }
    }
    public static boolean is_incresing(ArrayList<Integer> v){
        for(int i=0; i<v.size()-1; ++i){
            if(v.get(i) >= v.get(i + 1)) return false;
        }
        return v.size() > 1;
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        for(int i=0; i<n; ++i) a[i] = sc.nextInt();
        ktao();
        ok = 1;
        while(ok == 1){
            ArrayList <Integer> tmp = new ArrayList<>();
            for(int i=1; i<=n; ++i) if(x[i] != 0) tmp.add(a[i-1] * x[i]);
            if(is_incresing(tmp)) res.add(tmp);
            sinh();
        }
        for(int i=0; i<res.size(); ++i){
            k = "";
            for(Integer x : res.get(i)) k += Integer.toString(x) + " ";
            vs.add(k);
        }
        Collections.sort(vs);
        for(String str : vs) System.out.println(str);
        sc.close();
    }
}
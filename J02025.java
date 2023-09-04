import java.util.*;
public class J02025{
    static int n;
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
    public static boolean snt(int n){
        for(int i=2; i<=(int)Math.sqrt(n); ++i){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static boolean sum_is_odd_number(ArrayList<Integer> v){
        int sum = 0;
        for(int i=0; i<v.size(); ++i){
            sum += v.get(i);
        }
        return snt(sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=0; i<n; ++i){
                int x = sc.nextInt();
                a.add(x);
            }
            Collections.sort(a);
            Collections.reverse(a);
            ktao();
            ok = 1;
            while(ok == 1){
                ArrayList <Integer> tmp = new ArrayList<>();
                for(int i=1; i<=n; ++i) if(x[i] != 0) tmp.add(a.get(i - 1) * x[i]);
                if(sum_is_odd_number(tmp)) res.add(tmp);
                sinh();
            }
            for(int i=0; i<res.size(); ++i){
                k = "";
                for(Integer x : res.get(i)) k += Integer.toString(x) + " ";
                vs.add(k);
            }
            for(String str : vs) System.out.println(str);
            res.clear();
            vs.clear();
            Arrays.fill(x, 0);   
        }
        sc.close();   
    }
}
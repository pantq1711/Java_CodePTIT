import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class J02026_final{
    static int n;
    static int [] x = new int[25];
    static int ok;
    static int k;
    // static ArrayList<String> vs = new ArrayList<>();
    static Set<String> vs = new TreeSet<>();
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static void ktao(){
        for(int i=1; i<=k; ++i) x[i] = i;
    }
    public static void sinh(){
        int i = k;
        while(i >= 1 && x[i] == n - k + i){
            --i; 
        }
        if(i == 0) ok = 0;
        else {
            ++x[i];
            for(int j=i+1; j<=k; ++j) x[j] = x[j-1] + 1;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            n = sc.nextInt(); k = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=0; i<n; ++i){
                int x = sc.nextInt();
                a.add(x);
            }
            Collections.sort(a);
            ktao();
            ok = 1;
            while(ok == 1){
                for(int i=1; i<=k; ++i) System.out.print(a.get(x[i] - 1) + " ");
                System.out.println();
                sinh();
            }
            vs.clear();
            Arrays.fill(x, 0);  
        }
        sc.close();   
    }
}
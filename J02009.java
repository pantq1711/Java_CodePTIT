import java.util.*;

public class J02009{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer [][] a = new Integer[n][2];
        for(int i=0; i<n; ++i){
            for(int j=0; j<2; ++j){
                a[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(a, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer []t, Integer []t1){
                return t[0] - t1[0];
            }
        });
        long res = 0;
        for(int i=0; i<n; ++i){
            if(a[i][0] >= res){
                res = a[i][0] + a[i][1]; 
            }
            else {
                res += a[i][1];
            }
        }
        System.out.println(res);
    }
}

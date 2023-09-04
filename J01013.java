import java.util.*;
public class J01013
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int snt[] = new int[2000005];
        snt[0] = snt[1] = 0;
        for(int i=2; i<=1414; ++i){
            if(snt[i] == 0){
                for(int j=i*i; j<=2000000; j+=i){
                    if(snt[j] == 0) snt[j] = i;
                }
            }
        }
       for(int i=2; i<=2000000; ++i){
            if(snt[i] == 0) snt[i] = i;
       }
        int n,t = sc.nextInt();
        long sum = 0;
        while(t -- > 0){
            n = sc.nextInt();
            while(n > 1){
                sum += snt[n];
                n /= snt[n];    
            }
        }
        System.out.println(sum);
    }
}
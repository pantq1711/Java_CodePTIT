
import java.util.*;

public class J01004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), K = sc.nextInt();
        int [] A = new int[n];
        for(int i = 0; i<n; ++i) A[i] = sc.nextInt();
        int result = countPairs(A, K);
        System.out.println(result);
    }

    public static int countPairs(int[] arr, int K) {
        Map<Integer, Integer> mp = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            if (frequencyMap.containsKey(K - num)) {
                count += frequencyMap.get();
            }
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}

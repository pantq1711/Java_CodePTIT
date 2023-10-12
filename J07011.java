import java.util.*;
import java.io.*;

public class J07011 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("VANBAN.in"));
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> map = new HashMap<>();
        String s = "";
        while (n-- > 0) {
            String str = sc.nextLine().toLowerCase().trim();
            s += str + " ";
        }
        String[] words = s.split("\\W\\s*");
        for (String i : words)
            if (!i.equals("")) 
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
        
        ArrayList<Map.Entry<String, Integer>> arr = new ArrayList<>(map.entrySet());
        Collections.sort(arr, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue().equals(o2.getValue())) {
                    return o1.getKey().compareTo(o2.getKey());
                } else {
                    return o2.getValue() - o1.getValue();
                }
            }
        });
        for (Map.Entry<String, Integer> entrySet : arr) {
            System.out.println(entrySet.getKey() + " " + entrySet.getValue());
        }
    }
}
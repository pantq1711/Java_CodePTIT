import java.util.*;

public class J08011{
    
    public static boolean check(int n){
        if(n < 10) return true;
        while(n > 9){
            if(n / 10 % 10 > n % 10) return false;
            n /= 10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();
        Map <Integer, Integer> map = new LinkedHashMap<>();
        
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            if(check(num)) arr.add(num);
        }
        
        for(Integer num : arr){
            if(map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        
        ArrayList <Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
            
        });
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
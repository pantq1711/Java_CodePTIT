import java.util.*;

public class J03004
{
    public static void main(String[] args)
    {   
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            while(t-- >0){
                String n = sc.nextLine();
                Vector <String> v = new Vector<String>();
                String x = "";
                n = n.toLowerCase() + " ";
                for(int i=0; i<n.length(); ++i){
                    if(n.charAt(i) == ' '){
                        if(x != ""){
                            v.add(x);
                            x = "";
                        }
                    }
                    else x += n.charAt(i);
                }
                for(int i=0; i<v.size(); ++i){
                    String tmp = v.get(i);
                    System.out.print(tmp.substring(0, 1).toUpperCase() + tmp.substring(1) + " ");
                }
                System.out.println();
            }
        }
    }
}
import java.util.Arrays;   
import java.util.Scanner;
import java.util.*;
public class J01002{
    public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(a <= 0  || b <= 0) System.out.println("0");
        else 
        System.out.printf("%d %d", 2 * (a + b), a * b);
}
}

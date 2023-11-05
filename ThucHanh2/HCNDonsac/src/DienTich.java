/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.Stack;
public class DienTich {
    
    private int [] a;
    private int n;
    
    public DienTich(int [] a)
    {
        this.a = a;
        this.n = a.length;
    }
    
    public long getArea()
    {
        int [] l = new int[n];
        int [] r = new int[n];
        Stack <Integer> st1 = new Stack<>();
        Stack <Integer> st2 = new Stack<>();
        
        st1.push(n-1);
        for(int i=n-1; i>=0; --i)
        {
            while(!st1.isEmpty() && a[i] <= a[st1.peek()])
            {
                st1.pop();
            }
            r[i] = st1.isEmpty() ? n - 1 : st1.peek() - 1;
            st1.push(i);
        }
        for(int i=0; i<n; ++i)
        {
            while(!st2.isEmpty() && a[i] <= a[st2.peek()])
            {
                st2.pop();
            }
            l[i] = st2.isEmpty() ? 0 : st2.peek() + 1;
            st2.push(i);
        }
        long res = 0;
        for(int i=0; i<n; ++i)
        {
            res = Math.max(res, (long) a[i] * (r[i] - l[i] + 1));
        }
        return res;
    }
}

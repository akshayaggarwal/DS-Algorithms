import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class qu_using_stack {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a,b,si;
        float i,n;
        String parts[];
        String str;
        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        
        n=Integer.parseInt(sc.nextLine());
        for(i=0;i<n;i++)
                {
            str = sc.nextLine();
           // System.out.println(str);
            parts=str.split(" ");
            
            //System.out.println("reached");
            a = Integer.parseInt(parts[0]);
            //System.out.println(a);
            switch(a)
            {
                case 1:
                        {
            
                            b = Integer.parseInt(parts[1]);
                            st1.push(b);
                    
                            break;
                        }
                case 2:{
                                si = st1.size();
                                while(si!=0)
                                {
                                    st2.push(st1.pop());
                                    si=st1.size();
                                }
                    si = st2.size();
                    if(si!=0)
                        st2.pop();
                    
                    si = st2.size();
                    
                                while(si!=0)
                                {
                                    st1.push(st2.pop());
                                    si=st2.size();
                                }
                    break;
                }
                case 3:{
                   // System.out.println("reached");
                    si = st1.size();
                                while(si!=0)
                                {
                                    st2.push(st1.pop());
                                    si=st1.size();
                                }
                    si = st2.size();
                    if(si!=0)
                        System.out.println(st2.peek());
                    
                                while(si!=0)
                                {
                                    st1.push(st2.pop());
                                    si=st2.size();
                                }
                    break;
                }
                default:break;
            }
        }
    }
}

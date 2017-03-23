import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class maxelem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack <Integer> stack = new Stack <Integer>();
        Stack <Integer> stack2 = new Stack <Integer>();

        Scanner sc = new Scanner(System.in);
        int n,a,b,max,temp,si,c;
        b = 0; 
        String str;
        
        n = sc.nextInt();
      //  sc.nextLine();
        if(n>=1 && n<=100000)
            {
        while(n!=0)
            {
               
            
                a = sc.nextInt();
                
                if(a == 1)
                    {
                    b = sc.nextInt();
                    if(stack.empty())
                        stack2.push(b);
                    else
                        {
                            c = stack2.peek();
                            if(b>c)
                                stack2.push(b);
                            else
                                stack2.push(c);
                    }
                    stack.push(b);
                }
             
                else if(a == 2)
                {
                    stack.pop();
                    stack2.pop();
                }
                
                else
                    {
                    max = stack2.peek();
                   /* 
                    while(stack.size()!=0)
                        {
                        temp = stack.pop();
                        if(temp>max)
                            max = temp;
                        stack2.push(temp);
                    }
                    
                    while(stack2.size()!=0)
                        {
                        stack.push(stack2.pop());
                    }
                    */
                    System.out.println(max);
                }
            n--;
         //   System.out.println("size of stack is "+stack.size());

        }
        
        }
    }
}

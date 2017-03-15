import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bracket_stack {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i;
        char c;
        
        Stack <Character> st = new Stack<Character>();
        int flag = 0;
        
        for(int a0 = 0; a0 < t; a0++){
            flag = 0;
            String s = in.next();
            char arr[] = s.toCharArray();
            for(i=0;i<arr.length;i++)
             {
                if(arr[i]=='{'||arr[i]=='['||arr[i]=='(')
                    st.push(arr[i]);
                else    
                    {
                    c = st.pop();
                    if(c=='{' && arr[i]=='}'  || c=='(' && arr[i]==')'  || c=='[' && arr[i]==']')
                        continue;
                    else
                        {
                        flag=1;
                        break;
                        }
                }
            }
            if(flag==1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}


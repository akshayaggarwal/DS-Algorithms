import java.io.*;
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String right,left;
        int flag;
        char ch1,ch2;
        
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len = A.length();
        
        left = A.substring(0,len/2);
        
        if(len%2 == 0)
            right = A.substring(len/2,len);
        else
            right = A.substring(len/2 + 1,len);
        
        flag = 0;
        
        for(int i=0;i<len/2;i++)
            {
            ch1 = left.charAt(i);
            ch2 = right.charAt(len/2 - i -1);
            if(ch1!=ch2)
                {
                flag = 1;
                break;
            }
        }
        
        if(flag==0)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        //if(right.compareTo(left) == 0)
          //  System.out.println("Yes");
        //else
          //  System.out.println("No");
        
    }
}


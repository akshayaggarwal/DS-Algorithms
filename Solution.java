import java.util.*;

public class Solution
    {
public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        
        n = sc.nextInt();
    
        sc.nextLine();
        int arr[][] = new int[n][];
    
        String str[] = new String[n];
    
        for(i=0;i<n;i++)
            {
            //arr[i] = new int[n];
            str[i] = sc.nextLine();
            //arr[i][] = str.toCharArray();
        }
    
        if(str[0].charAt(0) == 'p')
            {
                for(i=0;i<n/2;i++)
                    System.out.println("UP");
            
                for(i=0;i<n/2;i++)
                    System.out.println("LEFT");
        }
    
            else if(str[0].charAt(n-1) == 'p')
            {
                for(i=0;i<n/2;i++)
                    System.out.println("UP");
            
                for(i=0;i<n/2;i++)
                    System.out.println("RIGHT");
        }
    
            else if(str[n-1].charAt(0) == 'p')
            {
                for(i=0;i<n/2;i++)
                    System.out.println("DOWN");
            
                for(i=0;i<n/2;i++)
                    System.out.println("LEFT");
        }
    
            else if(str[n-1].charAt(n-1) == 'p')
            {
                for(i=0;i<n/2;i++)
                    System.out.println("DOWN");
            
                for(i=0;i<n/2;i++)
                    System.out.println("RIGHT");
        }
        
    
}
}

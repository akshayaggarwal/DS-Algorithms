import java.util.*;

public class truck
    {
        public static void main(String args[])
            {
                Scanner sc = new Scanner(System.in);
                int n,a[],b[],i,respetrol,j,ctr;
                n = sc.nextInt();
                a = new int[n];
                b = new int[n];
            
            sc.nextLine();
            
                for(i=0;i<n;i++)
                    {
                    
                    a[i] = sc.nextInt();
                    b[i] = sc.nextInt();
                    if(i!=n-1)
                        sc.nextLine();
                    //System.out.println(a[i]+" "+b[i]+" ");
                    
                }
            
                respetrol = 0;
            
            for(j=0;j<n;j++)
                {
              respetrol = 0;
              ctr = 0;
                
                for(i=j;;)
                    {
                    ctr++;
                    respetrol+=a[i];
                    if(respetrol<b[i])
                        break;
                    
                    respetrol-=b[i];
                    
                    if(i+1 == n && ctr<n)
                        i=0;
                    else
                        i++;
                    
                    if(ctr==n)
                        break;
                }
                if(ctr == n)
                {
                    System.out.println(j);
                    break;
                }
            }
                    
        }
}

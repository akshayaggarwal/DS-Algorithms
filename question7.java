public class Solution {
    public int reverse(int x) {
        
        int rev,flag,flag2,a,b;
        int temp;
        flag = 0;
        rev = 0;
        flag2 = 0;
        a = 0;
        
        if(x<0)
        {
            flag = 1;
            x*=-1;
        }
        System.out.println(x);
        while(x!=0)
        {
            temp = (rev)*10 + x%10;
            if(temp<(rev)) {
                flag2=1;
                break;
        }
            else
                rev = temp;
                if(x/10 == 0)
                    a = x%10;
            x/=10;
            System.out.println(temp);
        }
        
       
            
            //System.out.println(x);
            System.out.println(rev);
            System.out.println(a);
            System.out.println(rev%10);

            
            if(flag2==1 || (a!=rev%10))
                return 0;
            else
            {
                 if(flag ==1)
                    rev*=-1;
                    
                  return rev;
            }
                
    }
}

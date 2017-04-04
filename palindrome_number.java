public class palindrome_number {
    public boolean isPalindrome(int x) {
        
        int temp,flag,temp2;
        flag = 0;
        temp = 0;
        temp2 = x;
        if(x<0)
            return false;
        if(x == 0)
            return true;
        while(x!=0)
        {
            temp = temp*10 + x%10;
 
           /* if(temp == x)
            {
                flag = 1;
                break;
            }*/
            x/=10;
            /*if(temp == x)
            {
                flag = 1;
                break;
            }*/
        }
        if(temp2 == temp)
            return true;
        else
            return false;
    }
}

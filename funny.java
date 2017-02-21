import java.util.*;

public class funny
{
	int funnyornot(String str)
	{
		int i,j,a,b;
		int n = str.length();
		int flag = 0;
		for(i=1,j=n-2;i<n;i++,j--)
		{
			//System.out.println(str.charAt(i));
			//System.out.println(str.charAt(i-1));
			a=str.charAt(i)-str.charAt(i-1);
			b=str.charAt(j)-str.charAt(j+1);
			if(a<0)
				a*=-1;
			if(b<0)
				b*=-1;
			//System.out.println(a);
			//System.out.println(b);
			if(a!=b)
			{
				flag =1;
				break;
			}
		}

		return flag;
	}

	public static void main(String args[])
	{
		String str;
		int ctr,i;
		funny obj = new funny();
		Scanner sc = new Scanner(System.in);
		ctr=sc.nextInt();
		sc.nextLine();		
		for(i=0;i<ctr;i++)
		{		
		str=sc.nextLine();
		int j = obj.funnyornot(str);
		if(j==0)
			System.out.println("Funny");
		else
			System.out.println("Not Funny");
		}
	}
}

import java.util.*;
class test1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long a,b,i;
		long ctr1,ctr2;
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(a>=1 && a<=100000 && b>=1 && b<=a)
		{		
 
		//front		
		if(b==1)
			ctr1 = 0;
		else
		{
			ctr1 = 1;
			for(i=2;i<=a;i+=2)
			{
				if(i==b || i+1==b)
					break;
				ctr1++;	
			}
		}
		//front ends

		//back
		if(a%2 == 0)
			{
				if(b==a)
					ctr2 = 0;
				else
				{
					ctr2 = 1;
					for(i=a-1;i>=0;i-=2)
					{
						if(b==i || b==(i-1))
							break;
						ctr2++;
					}
				}
			}
		else
			{
				if(b==a || b==(a-1))
					ctr2 = 0;
				else
				{
					ctr2 = 1;
					for(i=a-2;i>=0;i-=2)
					{
						if(b==i || b==(i-1))
							break;
						ctr2++;
					}
				}
			}
		if(ctr1<ctr2)
			System.out.println(ctr1);
		else
			System.out.println(ctr2);

	}
	}
}

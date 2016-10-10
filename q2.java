/*Given a number your task is to complete the function convertFive which takes an integer n as argument and replaces all zeros in the number n with 5 .Your function should return the converted number .*/
import java.lang.*;
import java.util.*;

class q2
{
	public void convertFive(int n)
	{
		int sum,r,i;
		double newnum;
		newnum = 0;
		r = 0;
		for(sum = n,i = 0;sum!=0;sum = sum/10, i++)
		{
			r = sum % 10;
			if(r!=0)
				newnum = newnum + r*(Math.pow(10,i));
			else
				newnum = newnum + 5*(Math.pow(10,i));
		}
		System.out.println((int)newnum);
					
	}

 	public static void main(String args[])
	{
		q2 obj = new q2();		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j,k;		
		for(j=i;j>0;j--)
			{
			k = scan.nextInt();			
			obj.convertFive(k);
			}		
	}
}

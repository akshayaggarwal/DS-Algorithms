// to find the missing number in integer array of 1 to 100
import java.util.*;
class q1
{
	public static void main(String args[])
	{
		int i;
		int arr[] = new int[100];
		for (i=0;i<100;i++)
			arr[i] = i+1;
		Random rand = new Random();
		int n = rand.nextInt(100);
		arr[n] = 0;
				
		System.out.println("random number is");
		System.out.println(n+1);
		
		int sum, sum2;
		sum = sum2 = 0;
		for (i=0;i<100;i++)
		{
			sum = sum + i + 1;
			//System.out.println(sum);
			sum2 = sum2 + arr[i];
		}
		System.out.println("missing number is"+(sum - sum2));
	}
}

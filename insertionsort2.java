import java.util.*;
class insertionsort2
{
	int[] arr;
	public static void main(String args[])
	{
		insertionsort2 obj = new insertionsort2();
		int na,n,i,temp,j;
		Scanner sc = new Scanner(System.in);

		//StringBuilder sb;
	
		//String str = sc.nextLine();
		na = sc.nextInt();		
		obj.arr = new int[1000];
		sc.nextLine();
		i = 0;
		while(i<na)
		{		
			obj.arr[i]=sc.nextInt();
			i++;		
		}	

		for(n=2;n<=na;n++)// n=2 means index ranges from 0 to 1	
		{
			
		

		temp = obj.arr[n-1];
		//System.out.println("temp is "+temp);
		for(i=n-2;i>=0;i--)
		{
			//sb = new StringBuilder();
			if(obj.arr[i]>temp)
				obj.arr[i+1] = obj.arr[i];
			else
				break;
			
		}
		obj.arr[i+1] = temp;
		for(j=0;j<na;j++)
			System.out.print(obj.arr[j]+" ");
		System.out.println();
		
		}
		
		//sb = new StringBuilder();
		for(j=0;j<na;j++)
			System.out.print(obj.arr[j]+" ");
		System.out.println();
	}
}

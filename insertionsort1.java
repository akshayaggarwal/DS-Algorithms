import java.util.*;
class insertionsort1
{
	int[] arr;

	public static void main(String args[])
	{
		insertionsort1 obj = new insertionsort1();
		int n,i,temp,j;
		Scanner sc = new Scanner(System.in);

		StringBuilder sb;
	
		//String str = sc.nextLine();
		n = sc.nextInt();		
		obj.arr = new int[1000];
		sc.nextLine();
		i = 0;
		while(i<n)
		{		
			obj.arr[i]=sc.nextInt();
			i++;		
		}	

		
		temp = obj.arr[n-1];
		for(i=n-2;i>=0;i--)
		{
			//sb = new StringBuilder();
			if(obj.arr[i]>temp)
				obj.arr[i+1] = obj.arr[i];
			else
				break;
			for(j=0;j<n;j++)
				System.out.print(obj.arr[j]+" ");
			System.out.println();
		}
		obj.arr[i+1] = temp;
		//sb = new StringBuilder();
		for(j=0;j<n;j++)
			System.out.print(obj.arr[j]+" ");
		System.out.println();
	}
}

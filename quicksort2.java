import java.util.*;
class quicksort2
{
	int[] arr;

	void quick(int low,int high)
	{
		int i;				
		int pivot;
		if(low<high)
		{
			pivot = partition(low,high);
			
			if(pivot-low>1)
				quick(low,pivot);
			
			/*if((pivot-low)>=2)
			{			
			for(i=low;i<(pivot);i++)
				System.out.print(arr[i]+" ");
			System.out.println();
			}*/
			
			if(high-pivot>2)
				quick(pivot+1,high);
				
			/*if(((pivot+1)-high)>=2)
			{			
			for(i=pivot+1;i<high;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
			}*/

		}

	}

	

	int partition(int low, int high)
	{
		int i,temp,j,k,index,n=7;		
		int pivot = arr[low];
		int leftwall = low;
		j=0;
		index = 0;
		for(i=low;i<high;i++)
			{
				if(arr[i]<pivot)
				{
					temp=arr[i];
					arr[i]=arr[leftwall];
			 		arr[leftwall]=temp;
					leftwall=leftwall+1;		
				}
				
			}
		for(i=leftwall;i<high;i++)
		{
			if(arr[i]==pivot)
				{
				index = i;
				break;
				}
		}		
		
		for(i=index;i>leftwall;i--)
			arr[i]=arr[i-1];

		arr[leftwall] = pivot;
		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();		
		return leftwall;
	}

	public static void main(String args[])
	{	
		quicksort2 obj = new quicksort2();
		Scanner sc = new Scanner(System.in);
		obj.arr = new int[1000];		
		int i,n,j;
		n=sc.nextInt();
		sc.nextLine();
		for(i=0;i<n;i++)
			obj.arr[i]=sc.nextInt();
		obj.quick(0,n);
		for(i=0;i<n;i++)
			System.out.print(obj.arr[i]+" ");
		System.out.println();
		
	}
}

import java.util.*;
class quicksort3
{
	int[] arr;

	void quick(int low,int high)
	{
		int i;				
		int pivot;
		high = high-1;
		if(low<high)
		{
			pivot = partition(low,high);
			
			//if(pivot-low>1)
			quick(low,pivot);
			
			/*if((pivot-low)>=2)
			{			
			for(i=low;i<(pivot);i++)
				System.out.print(arr[i]+" ");
			System.out.println();
			}*/
			
			//if(high-pivot>2)
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
		int pivot = arr[high];
		int leftwall = low-1;
		j=0;
		index = 0;
		for(i=low;i<high-1;i++)
			{
				if(arr[i]<pivot)
				{
					leftwall=leftwall+1;
					temp=arr[i];
					arr[i]=arr[leftwall];
			 		arr[leftwall]=temp;
					//leftwall=leftwall+1;		
				}
				
			}
		
		temp=arr[i];
		arr[i]=arr[leftwall+1];
		arr[leftwall+1]=temp;
		return leftwall+1;
	}

	public static void main(String args[])
	{	
		quicksort3 obj = new quicksort3();
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

import java.util.*;
class quicksort1
{
	int[] arr;
	int[] left;
	int[] right;
	int[] equal;

	public static void main(String args[])
	{
		quicksort1 obj = new quicksort1();
		obj.arr = new int[1000];
		obj.left = new int[1000];
		obj.right = new int[1000];
		obj.equal = new int[1000];
		Scanner sc = new Scanner(System.in);
		int l,j,k,i,n;
		n = sc.nextInt();
		sc.nextLine();
		i = 0;
		while(i<n)
			{			
			obj.arr[i] = sc.nextInt();
			i = i + 1;
			}		
		int p = obj.arr[0];
		j = 0;
		k = 0;
		l = 0;
		for(i=0;i<n;i++)
		{
			if(obj.arr[i]<p)
				{
				obj.left[j] = obj.arr[i];
				j++;
				}
			else if(obj.arr[i]>p)
				{
				obj.right[k] = obj.arr[i];
				k++;
				}
			else
				{
				obj.equal[l] = obj.arr[i];
				l++;
				}
		}		
		for(i=0;i<j;i++)
			System.out.print(obj.left[i]+" ");
		for(i=0;i<l;i++)
			System.out.print(obj.equal[i]+" ");
		for(i=0;i<k;i++)
			System.out.print(obj.right[i]+" ");
	}
}

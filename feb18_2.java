import java.util.*;

class feb18_2
{
	int arr[];	

	public static void main(String args[])
	{
		feb18_2 obj = new feb18_2();
		int i,j,n,d,var;
		String temp,parts[];
		
		Scanner sc = new Scanner(System.in);
		temp=sc.nextLine();
		parts = temp.split(" ");
		n = Integer.parseInt(parts[0]);
		d = Integer.parseInt(parts[1]);

		obj.arr = new int[n];

		temp=sc.nextLine();
		parts = temp.split(" ");

		for(i=0;i<n;i++)
		{
			obj.arr[i] = Integer.parseInt(parts[i]);
		//	System.out.println("hi");
		}


//System.out.println("bye");
		for(i=0;i<d;i++)
		{
			var = obj.arr[0];
			for(j=1;j<n;j++)
				obj.arr[j-1]=obj.arr[j];
			obj.arr[j-1] = var;
		}
		
		for(i=0;i<n;i++)
		{
			System.out.print(obj.arr[i]+" ");
		}

	}	
}

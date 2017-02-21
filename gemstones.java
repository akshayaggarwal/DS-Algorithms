import java.util.*;

public class gemstones
{
	int arr[][];

	public static void main(String args[])
	{
		gemstones obj = new gemstones();
		String str;
		int n,i,ctr,flag,j;
		char ch;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		obj.arr=new int[n][];
		for(i=0;i<n;i++)
			obj.arr[i]=new int[26];
		
		for(i=0;i<n;i++)		
			{for(j=0;j<26;j++)
				obj.arr[i][j]=0;}			

		sc.nextLine();		
		for(i=0;i<n;i++)		
			{			
				str=sc.nextLine();
				for(j=0;j<str.length();j++)
				{
					ch=str.charAt(j);
					//System.out.println(ch);System.out.println(ch-97);					
					obj.arr[i][ch-97]++;
				}
			}
		ctr=0;	
		for(j=0;j<26;j++)
		{
			flag=0;			
			for(i=0;i<n;i++)
			{
				if(obj.arr[i][j]==0)
					{
					flag=1;
					break;
					}
			}
			if(flag==0)
				ctr++;
		}
		System.out.println(ctr);
	}
}
